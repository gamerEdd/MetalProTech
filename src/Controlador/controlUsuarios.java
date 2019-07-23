/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.NewHibernateUtil;
import Modelo.Usuario;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author eddgt
 */
public class controlUsuarios {

    public void guardar(Usuario user) {
        SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
    }

    public void actualizar(Usuario user) {
        SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
    }

    public void eliminar(Usuario user) {
        SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");

    }

    public static java.util.List<Usuario> UsuariosShow() {
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();

        java.util.List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
        return usuarios;
    }
}

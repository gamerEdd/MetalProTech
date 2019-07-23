/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.NewHibernateUtil;
import Modelo.Umedida;
import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author eddgt
 */
public class controlProductos {
     public void guardarCategoria(Categoria cat) {
        SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cat);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Se ha Guardado Una Nueva Categoria ");
         JOptionPane.showMessageDialog(null, "Reinicie la Ventana Para Ver Los Cambios ");
        
    }
         public void guardarMedida(Umedida cat) {
        SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cat);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Se ha Guardado Una Nueva Categoria ");
         JOptionPane.showMessageDialog(null, "Reinicie la Ventana Para Ver Los Cambios ");
        
    }
     
     
     
     
     
      public static List<Categoria> categoriasShow(){
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        List<Categoria> sucursales = sesion.createCriteria(Categoria.class).list();
        return sucursales;
    }
        public static List<Umedida> MedidasShow(){
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        List<Umedida> medida = sesion.createCriteria(Categoria.class).list();
        return medida;
    }
      
}

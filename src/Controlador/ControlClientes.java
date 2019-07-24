/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.NewHibernateUtil;
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
public class ControlClientes {
    public void guardarCliente (Cliente cli){
         SessionFactory sec = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sec.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Nuevo Cliente Agregado");
    }
    
      public static List<Cliente> ClienteShow(){
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        List<Cliente> clientes= sesion.createCriteria(Cliente.class).list();
        return clientes;
    }
}

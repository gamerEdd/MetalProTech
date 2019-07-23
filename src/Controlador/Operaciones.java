/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.NewHibernateUtil;
import java.math.*;
import java.util.*;
import javax.swing.*;
import org.hibernate.*;
import Modelo.*;
public class Operaciones {
   public void altaCategoria(Categoria cat){
      SessionFactory sec = NewHibernateUtil.getSessionFactory();
      Session session;
      session=sec.openSession();
      Transaction tx=session.beginTransaction();
      session.save(cat);
      tx.commit();
      session.close();
      JOptionPane.showMessageDialog(null,"Insertado correctamente");
      
   }
    
    
    
}

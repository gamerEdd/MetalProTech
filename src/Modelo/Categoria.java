package Modelo;
// Generated 23/07/2019 14:36:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer codcateg;
     private String nombrecateg;
     private Set productos = new HashSet(0);

    public Categoria() {
    }

    public Categoria(String nombrecateg, Set productos) {
       this.nombrecateg = nombrecateg;
       this.productos = productos;
    }
   
    public Integer getCodcateg() {
        return this.codcateg;
    }
    
    public void setCodcateg(Integer codcateg) {
        this.codcateg = codcateg;
    }
    public String getNombrecateg() {
        return this.nombrecateg;
    }
    
    public void setNombrecateg(String nombrecateg) {
        this.nombrecateg = nombrecateg;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


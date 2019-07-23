package Modelo;
// Generated 23/07/2019 14:36:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private String provid;
     private String provnombre;
     private String provciudad;
     private String provdir;
     private String provcontacto;
     private String provcelular;
     private String provtelefono;
     private String provemail;
     private Set facturacs = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String provid, String provnombre, String provcontacto) {
        this.provid = provid;
        this.provnombre = provnombre;
        this.provcontacto = provcontacto;
    }
    public Proveedor(String provid, String provnombre, String provciudad, String provdir, String provcontacto, String provcelular, String provtelefono, String provemail, Set facturacs) {
       this.provid = provid;
       this.provnombre = provnombre;
       this.provciudad = provciudad;
       this.provdir = provdir;
       this.provcontacto = provcontacto;
       this.provcelular = provcelular;
       this.provtelefono = provtelefono;
       this.provemail = provemail;
       this.facturacs = facturacs;
    }
   
    public String getProvid() {
        return this.provid;
    }
    
    public void setProvid(String provid) {
        this.provid = provid;
    }
    public String getProvnombre() {
        return this.provnombre;
    }
    
    public void setProvnombre(String provnombre) {
        this.provnombre = provnombre;
    }
    public String getProvciudad() {
        return this.provciudad;
    }
    
    public void setProvciudad(String provciudad) {
        this.provciudad = provciudad;
    }
    public String getProvdir() {
        return this.provdir;
    }
    
    public void setProvdir(String provdir) {
        this.provdir = provdir;
    }
    public String getProvcontacto() {
        return this.provcontacto;
    }
    
    public void setProvcontacto(String provcontacto) {
        this.provcontacto = provcontacto;
    }
    public String getProvcelular() {
        return this.provcelular;
    }
    
    public void setProvcelular(String provcelular) {
        this.provcelular = provcelular;
    }
    public String getProvtelefono() {
        return this.provtelefono;
    }
    
    public void setProvtelefono(String provtelefono) {
        this.provtelefono = provtelefono;
    }
    public String getProvemail() {
        return this.provemail;
    }
    
    public void setProvemail(String provemail) {
        this.provemail = provemail;
    }
    public Set getFacturacs() {
        return this.facturacs;
    }
    
    public void setFacturacs(Set facturacs) {
        this.facturacs = facturacs;
    }




}


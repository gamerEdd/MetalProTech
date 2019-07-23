package Modelo;
// Generated 23/07/2019 14:36:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private String codPro;
     private Categoria categoria;
     private Tipoprod tipoprod;
     private Umedida umedida;
     private String descripcion;
     private String precio1;
     private String stock;
     private String precio2;
     private String precioc;
     private Set detallefacturas = new HashSet(0);
     private Set detallefacturacs = new HashSet(0);

    public Producto() {
    }

	
    public Producto(String codPro, Categoria categoria, Tipoprod tipoprod, Umedida umedida, String descripcion, String precio1, String stock) {
        this.codPro = codPro;
        this.categoria = categoria;
        this.tipoprod = tipoprod;
        this.umedida = umedida;
        this.descripcion = descripcion;
        this.precio1 = precio1;
        this.stock = stock;
    }
    public Producto(String codPro, Categoria categoria, Tipoprod tipoprod, Umedida umedida, String descripcion, String precio1, String stock, String precio2, String precioc, Set detallefacturas, Set detallefacturacs) {
       this.codPro = codPro;
       this.categoria = categoria;
       this.tipoprod = tipoprod;
       this.umedida = umedida;
       this.descripcion = descripcion;
       this.precio1 = precio1;
       this.stock = stock;
       this.precio2 = precio2;
       this.precioc = precioc;
       this.detallefacturas = detallefacturas;
       this.detallefacturacs = detallefacturacs;
    }
   
    public String getCodPro() {
        return this.codPro;
    }
    
    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Tipoprod getTipoprod() {
        return this.tipoprod;
    }
    
    public void setTipoprod(Tipoprod tipoprod) {
        this.tipoprod = tipoprod;
    }
    public Umedida getUmedida() {
        return this.umedida;
    }
    
    public void setUmedida(Umedida umedida) {
        this.umedida = umedida;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPrecio1() {
        return this.precio1;
    }
    
    public void setPrecio1(String precio1) {
        this.precio1 = precio1;
    }
    public String getStock() {
        return this.stock;
    }
    
    public void setStock(String stock) {
        this.stock = stock;
    }
    public String getPrecio2() {
        return this.precio2;
    }
    
    public void setPrecio2(String precio2) {
        this.precio2 = precio2;
    }
    public String getPrecioc() {
        return this.precioc;
    }
    
    public void setPrecioc(String precioc) {
        this.precioc = precioc;
    }
    public Set getDetallefacturas() {
        return this.detallefacturas;
    }
    
    public void setDetallefacturas(Set detallefacturas) {
        this.detallefacturas = detallefacturas;
    }
    public Set getDetallefacturacs() {
        return this.detallefacturacs;
    }
    
    public void setDetallefacturacs(Set detallefacturacs) {
        this.detallefacturacs = detallefacturacs;
    }




}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

/**
 *
 * @author usuario
 */
public class DisplayItem {
    private String texto;
    private int valor;
    private String valor2;
    
    

    
    
    
    
    
    
    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public DisplayItem(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }

    public DisplayItem(String texto, String valor2) {
        this.texto = texto;
        this.valor2 = valor2;
    }
public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }
 

    @Override
    // ontener una representacion textual de un objeto
    public String toString() {
        return this.texto;
    }
    
public String ti(){
    return this.valor2;
}
    
 
}

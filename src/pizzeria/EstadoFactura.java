/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author facu-
 */
public class EstadoFactura {
    
    private String nombre;
    private boolean codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getCodigo() {
        return codigo;
    }

    public void setCodigo(boolean codigo) {
        this.codigo = codigo;
    }
    
    public static boolean esGenerada(){
        return true;
    }
    
    public static boolean esPteFacturacion(){
        return true;
    }
    
}

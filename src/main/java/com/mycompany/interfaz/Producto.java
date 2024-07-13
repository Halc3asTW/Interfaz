
package com.mycompany.interfaz;

/**
 *
 * @author Misael Arcos
 */
public class Producto {
    private String descripcion;
    private String codigo;
    private String valor;
    
    public Producto(String descripcion, String codigo, String valor) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", valor=" + valor + '}';
    }
}
    

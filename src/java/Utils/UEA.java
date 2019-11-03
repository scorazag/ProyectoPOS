/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author scora
 */
public class UEA {
    private String clave;
    private String nombre;
    private int creditos;

    public UEA() {
    }

    public UEA(String clave, String nombre, int creditos) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


}
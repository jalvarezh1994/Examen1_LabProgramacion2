/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlabprogra2;

import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Persona {

    private String Nombre;
    private int Edad;
    private int ID;
    private int ID_Boleto;
    private String Departamento;
    private float Dinero;

    public Persona() {
    }

    public Persona(String Nombre, int Edad, int ID, int ID_Boleto, String Departamento, float Dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.ID_Boleto = ID_Boleto;
        this.Departamento = Departamento;
        this.Dinero = Dinero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Boleto() {
        return ID_Boleto;
    }

    public void setID_Boleto(int ID_Boleto) {
        this.ID_Boleto = ID_Boleto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float Dinero) {
        this.Dinero = Dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", ID=" + ID + ", ID_Boleto=" + ID_Boleto + ", Departamento=" + Departamento + ", Dinero=" + Dinero + '}';
    }

}

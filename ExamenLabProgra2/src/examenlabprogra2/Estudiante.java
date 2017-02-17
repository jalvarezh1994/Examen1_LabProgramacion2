/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlabprogra2;

/**
 *
 * @author ofici
 */
public class Estudiante extends Persona{
    private String Carrera;

    public Estudiante() {
    }

    public Estudiante(String Carrera, String Nombre, int Edad, int ID, int ID_Boleto, String Departamento, float Dinero) {
        super(Nombre, Edad, ID, ID_Boleto, Departamento, Dinero);
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Carrera=" + Carrera + '}';
    }

    
}

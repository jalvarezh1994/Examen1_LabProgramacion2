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
public class Politico extends Persona {

    private String Afiliacion;

    public Politico() {
    }

    public Politico(String Afiliacion) {
        this.Afiliacion = Afiliacion;
    }

    public Politico(String Afiliacion, String Nombre, int Edad, int ID, int ID_Boleto, String Departamento, float Dinero) {
        super(Nombre, Edad, ID, ID_Boleto, Departamento, Dinero);
        this.Afiliacion = Afiliacion;
    }

    public String getAfiliacion() {
        return Afiliacion;
    }

    public void setAfiliacion(String Afiliacion) {
        this.Afiliacion = Afiliacion;
    }

    @Override
    public String toString() {
        return "Politico{" + "Afiliacion=" + Afiliacion + '}';
    }

}

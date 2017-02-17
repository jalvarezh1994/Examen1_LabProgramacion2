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
public class Empleado extends Persona {
    private String Empleo;

    public Empleado(String Empleo, String Nombre, int Edad, int ID, int ID_Boleto, String Departamento, float Dinero) {
        super(Nombre, Edad, ID, ID_Boleto, Departamento, Dinero);
        this.Empleo = Empleo;
    }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmpleo() {
        return Empleo;
    }

    public void setEmpleo(String Empleo) {
        this.Empleo = Empleo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Empleo=" + Empleo + '}';
    }
    
    
}

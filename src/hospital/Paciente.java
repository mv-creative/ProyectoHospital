/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author Kenshin
 */
public class Paciente extends Persona {

    public Paciente(String nombre, String apellido, int edad, int telefono) {
        super(nombre, apellido);
        this.edad = edad;
        this.telefono = telefono;
        diagnostico = new ArrayList<Pregunta>();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDiagnostico(Pregunta pregunta) {
        diagnostico.add(pregunta);
    }

    public void mostrarDiagnostico() {
        for (Pregunta preguntaActual : diagnostico) {
            System.out.println(preguntaActual.toString());
        }
    }

    private int edad;
    private int telefono;
    private ArrayList<Pregunta> diagnostico;

}

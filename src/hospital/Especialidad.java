/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Kenshin
 */
public class Especialidad {
    private String nombre;
    private int numeroPreguntas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public Especialidad(String nombre, int numeroPreguntas) {
        this.nombre = nombre;
        this.numeroPreguntas = numeroPreguntas;
    }

    public Especialidad() {
    }
}

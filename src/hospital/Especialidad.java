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
    private baseInfoSAD SADespecialidades;
    // private int numeroPreguntas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        SADespecialidades = new baseInfoSAD();
        this.nombre = nombre;
    }

    public void addRespuestastrue(String pregunta) {
        SADespecialidades.addRespuestaTrue(pregunta);
    }

    // public int getNumeroPreguntas() {
    // return numeroPreguntas;
    // }

    // public void setNumeroPreguntas(int numeroPreguntas) {
    // this.numeroPreguntas = numeroPreguntas;
    // }

    public Especialidad(String nombre) {
        this.nombre = nombre;

    }

}

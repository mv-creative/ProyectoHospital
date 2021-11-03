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
public class Medico extends Persona {

    public Medico(Especialidad especialidad, String _nombre, String _Apellido) {
        super(_nombre, _Apellido);
        this.especialidad = especialidad;
        pacientesEnEspera = new ArrayList<Paciente>();
        numeroAtendidos = 0;
        numeroEnEspera = 0;
    }

    public void setNumeroAtendidos() {
        numeroAtendidos++;
    }

    public void setNumeroEnEspera() {
        numeroEnEspera++;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroAtendidos() {
        return numeroAtendidos;
    }

    public int getNumeroEnEspera() {
        return numeroEnEspera;
    }

    public void listarPacientes() {
        int numeroPaciente = 1;
        for (Paciente pacienteActual : pacientesEnEspera) {
            System.out.println(numeroPaciente + ". " + pacienteActual.toString());
        }
    }

    public void addPaciente(Paciente nuevoPaciente) {
        pacientesEnEspera.add(nuevoPaciente);
    }

    private ArrayList<Paciente> pacientesEnEspera;
    private Especialidad especialidad;
    private int numeroAtendidos;
    private int numeroEnEspera;

}

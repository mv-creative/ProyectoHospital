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
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    private ArrayList<Paciente> pacientesEnEspera;
    private Especialidad especialidad;

}

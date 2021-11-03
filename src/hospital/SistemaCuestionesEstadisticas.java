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
public class SistemaCuestionesEstadisticas {

    public SistemaCuestionesEstadisticas() {
        pacientesAtendidos = new ArrayList<Paciente>();
    }

    public void addPacienteAtendido(Paciente paciente) {
        pacientesAtendidos.add(paciente);
    }

    private ArrayList<Paciente> pacientesAtendidos;

}

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
public class CuerpoDeGuardia {
    public CuerpoDeGuardia() {
        numeroMedicosDeGuardia = 0;
        medicosDeGuaridia = new ArrayList<Medico>();
    }

    public void setNumeroMedicosDeGuardia() {
        numeroMedicosDeGuardia++;
    }

    public int getNumeroMedicosDeGuardia() {
        return numeroMedicosDeGuardia;
    }

    public void addMedico(Medico newMedico) {
        medicosDeGuaridia.add(newMedico);
        setNumeroMedicosDeGuardia();
    }

    public void listarMedicos() {
        System.out.println();
    }

    private ArrayList<Medico> medicosDeGuaridia;
    private int numeroMedicosDeGuardia;
}

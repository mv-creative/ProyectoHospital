/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.*;

/**
 *
 * @author Kenshin
 */
public class Hospital {
    public Hospital() {
        guardiaDeTurno = new CuerpoDeGuardia();
        // medicos = new ArrayList<Medico>();
        especialidad = new ArrayList<Especialidad>();
        especialidad.add(new Especialidad("Cardiologia"));
        especialidad.add(new Especialidad("Cirugia"));
        especialidad.add(new Especialidad("Traumatologia"));
        especialidad.add(new Especialidad("Pediatria"));
        especialidad.add(new Especialidad("odontologia"));

    }

    public void ingresarMedicoGuardia() {
        int contador = 1;
        int opcion = -1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.println();
        System.out.println("Especialidad: ");
        for (Especialidad especialidadActual : especialidad) {
            System.out.println(contador + ". " + especialidadActual.getNombre());
            contador++;
        }
        System.out.println();
        System.out.println("escoja una opcion: ");
        opcion = entrada.nextInt();
        guardiaDeTurno.addMedico(new Medico(especialidad.get(opcion - 1), nombre, apellido));
        System.out.println("Medico agregado exitosamente");
        entrada.close();
    }

    private CuerpoDeGuardia guardiaDeTurno;
    // private ArrayList<Medico> medicos;
    private ArrayList<Especialidad> especialidad;
}

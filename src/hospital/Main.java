/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author Kenshin
 */
public class Main {
    public static void main(String[] args) {
        Hospital miHospital = new Hospital();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ingresar medicos al grupo de guardia");
            System.out.println("2. Crear base de informacion SAD");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
            case 1:
                miHospital.ingresarMedicoGuardia();

                break;
            case 2:
                miHospital.crearBaseInfoSAD();
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
            case 4:
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 4");
            }

        }

    }
}

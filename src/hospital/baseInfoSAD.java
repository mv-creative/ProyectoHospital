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
public class baseInfoSAD {

    public baseInfoSAD() {
        preguntas = new ArrayList<Pregunta>();
        respuestasTrue = new ArrayList<Pregunta>();
    }

    public void addPregunta(String pregunta) {
        preguntas.add(new Pregunta(pregunta));
    }

    public void addRespuestaTrue(String pregunta) {
        respuestasTrue.add(new Pregunta(pregunta));
    }

    public void preguntar() {
        Scanner entrada = new Scanner(System.in);
        for (Pregunta preguntaActual : preguntas) {
            System.out.println(preguntaActual.getPregunta());
            preguntaActual.setRespuesta(entrada.nextLine());
            if (preguntaActual.getRespuesta()) {
                respuestasTrue.add(preguntaActual);
            }
        }
        entrada.close();
    }

    public void listar() {
        for (Pregunta PreguntaActual : preguntas) {
            System.out.println(PreguntaActual.getPregunta());
        }
    }

    private ArrayList<Pregunta> preguntas;
    private ArrayList<Pregunta> respuestasTrue;
}

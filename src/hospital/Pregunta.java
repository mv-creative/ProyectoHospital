package hospital;

public class Pregunta {

    public Pregunta(String _pregunta) {
        pregunta = _pregunta;
        respuesta = false;
    }

    public void setPregunta(String _pregunta) {
        pregunta = _pregunta;
    }

    public void setRespuesta(String _respuesta) {
        if (_respuesta.equalsIgnoreCase("si")) {
            respuesta = true;
        } else if (_respuesta.equalsIgnoreCase("no")) {
            respuesta = false;
        }
    }

    public String getPregunta() {
        return pregunta;
    }

    public boolean getRespuesta() {
        return respuesta;
    }

    @Override
    public String toString() {
        return pregunta + " " + respuesta;
    }

    private String pregunta;
    private boolean respuesta;
}

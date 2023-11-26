package dominio;

public class Participante {
    private String nombre;
    private String instrumento;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public Participante(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return nombre + (instrumento != null ? ", " + instrumento : "");
    }
}

package dominio;

import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void addActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("BANDA DE MÚSICA DE VILLAR DEL MONTE\n");

        for (Actuacion actuacion : actuaciones) {
            result.append(actuacion).append("\n");
        }

        return result.toString();
    }
}

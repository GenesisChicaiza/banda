package dominio;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Actuacion {
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Fecha de actuación: " + fecha + "\n");

        for (Participante participante : participantes) {
            result.append(participante).append("\n");
        }

        return result.toString();
    }
}

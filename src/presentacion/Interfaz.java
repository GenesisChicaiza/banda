package presentacion;

import java.time.LocalDate;
import java.math.BigDecimal;
import dominio.*;

public class Interfaz {
    public static void main(String[] args) {
        BandaMusica banda = new BandaMusica("Banda de Música de Villar del Monte");

        Actuacion act1 = new Actuacion(LocalDate.of(2023, 5, 20));
        banda.addActuacion(act1);

        Director director1 = new Director("Juan Pérez");
        act1.addParticipante(director1);

        MusicoSocio musicoSocio1 = new MusicoSocio("María Rodríguez", "flauta", 12345);
        act1.addParticipante(musicoSocio1);

        MusicoRefuerzo musicoRefuerzo1 = new MusicoRefuerzo("Pedro Gómez", "trompeta", new BigDecimal(150));
        act1.addParticipante(musicoRefuerzo1);

        Actuacion act2 = new Actuacion(LocalDate.of(2023, 6, 10));
        banda.addActuacion(act2);

        Director director2 = new Director("Ana García");
        act2.addParticipante(director2);

        MusicoSocio musicoSocio2 = new MusicoSocio("Carlos Martínez", "saxofón", 67890);
        act2.addParticipante(musicoSocio2);

        MusicoRefuerzo musicoRefuerzo2 = new MusicoRefuerzo("Laura Díaz", "clarinete", new BigDecimal(130));
        act2.addParticipante(musicoRefuerzo2);

        mostrarInformacion(banda);
    }

    private static void mostrarInformacion(BandaMusica banda) {
        System.out.println(banda);
    }
}

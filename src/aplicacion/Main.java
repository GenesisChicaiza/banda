package aplicacion;

import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        BandaMusica bd = new BandaMusica("Banda de Música de Villar del Monte");
        Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
        bd.addActuacion(act1);
        Director dir = new Director("José García López");
        act1.addParticipante(dir);
        MusicoSocio msc1 = new MusicoSocio("Antonio López Suárez", "clarinete", 28534);
        act1.addParticipante(msc1);
        MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal(121));
        act1.addParticipante(msr1);

        Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
        bd.addActuacion(act2);
        MusicoRefuerzo msr2 = new MusicoRefuerzo("María López Gil", "oboe", new BigDecimal(130));
        act2.addParticipante(dir);
        act2.addParticipante(msc1);
        act2.addParticipante(msr2);

        System.out.println(bd);
    }
}

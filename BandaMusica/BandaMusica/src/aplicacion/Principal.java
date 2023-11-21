package aplicacion;
import java.math.BigDecimal;
import java.time.LocalDate;

import dominio.Actuacion;
import dominio.BandaMusica;
import dominio.Director;
import dominio.MusicoRefuerzo;
import dominio.MusicoSocio;

public class Principal {
    public static void main(String[] args) {
        BandaMusica bd = new BandaMusica("Banda de Musica de Villar del Monte");
        Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
        bd.annadirActuacion(act1);
        Director dir = new Director("Jose Garcia Lopez");
        act1.annadirParticipante(dir);
        MusicoSocio msc1 = new MusicoSocio("Antonio Lopez Suarez", "clarinete", 28534);
        act1.annadirParticipante(msc1);
        MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal(121));
        act1.annadirParticipante(msr1);
        Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
        bd.annadirActuacion(act2);
        MusicoRefuerzo msr2 = new MusicoRefuerzo("Maria López Gil", "oboe", new BigDecimal(130));
        act2.annadirParticipante(dir);
        act2.annadirParticipante(msc1);
        act2.annadirParticipante(msr2);
        System.out.println(bd);
    }
}
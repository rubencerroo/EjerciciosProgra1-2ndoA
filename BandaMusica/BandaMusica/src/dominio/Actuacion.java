package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void annadirParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fecha de actuación: " + fecha + "\n");

        for (Participante participante : participantes) {
            sb.append(participante.toString()).append("\n");
        }

        return sb.toString();
    }
}

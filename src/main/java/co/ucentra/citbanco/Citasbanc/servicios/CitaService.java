package co.ucentra.citbanco.Citasbanc.servicios;

import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import co.ucentra.citbanco.Citasbanc.repositorios.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> listarCitasDelDia() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Implementar la lógica para filtrar las citas del día actual
        List<Cita> citasDelDia = citaRepository.findByFechaHoraBetween(
                fechaActual.atStartOfDay(), fechaActual.atTime(LocalTime.MAX)
        );

        return citasDelDia;
    }
}

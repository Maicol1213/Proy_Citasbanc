package co.ucentra.citbanco.Citasbanc.servicios;


import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import co.ucentra.citbanco.Citasbanc.repositorios.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }

    public List<Cita> listarCitasDelDia(LocalDate fecha, String sede, String tipoServicio) {
        LocalDateTime inicioDelDia = fecha.atStartOfDay();
        LocalDateTime finDelDia = fecha.atTime(LocalTime.MAX);
        if (tipoServicio == null || tipoServicio.isEmpty()) {
            return citaRepository.findAllByFechaHoraBetweenAndSedeServicio(inicioDelDia, finDelDia, sede);
        } else {
            return citaRepository.findAllByFechaHoraBetweenAndSedeServicioAndTipoServicio(inicioDelDia, finDelDia, sede, tipoServicio);
        }
    }
}

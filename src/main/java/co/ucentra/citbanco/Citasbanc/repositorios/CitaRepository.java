package co.ucentra.citbanco.Citasbanc.repositorios;


import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findAllByFechaHoraBetweenAndSedeServicio(LocalDateTime inicio, LocalDateTime fin, String sedeServicio);
    List<Cita> findAllByFechaHoraBetweenAndSedeServicioAndTipoServicio(LocalDateTime inicio, LocalDateTime fin, String sedeServicio, String tipoServicio);
}


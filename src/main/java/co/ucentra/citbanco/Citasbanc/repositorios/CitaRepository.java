package co.ucentra.citbanco.Citasbanc.repositorios;

import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findByFechaHoraBetween(LocalDateTime localDateTime, LocalDateTime localDateTime1);
    // Define métodos aficionados si es necesario
}






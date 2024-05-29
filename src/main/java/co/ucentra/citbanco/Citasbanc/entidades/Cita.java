package co.ucentra.citbanco.Citasbanc.entidades;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String identidad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaHora;
    private String sedeServicio;
    private String tipoServicio;

    public Cita() {
    }

    public Cita(Long id, String nombre, String identidad, String correo, String telefono, LocalDateTime fechaHora, String sedeServicio, String tipoServicio) {
        this.id = id;
        this.nombre = nombre;
        this.identidad = identidad;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaHora = fechaHora;
        this.sedeServicio = sedeServicio;
        this.tipoServicio = tipoServicio;
    }
}

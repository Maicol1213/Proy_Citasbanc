package co.ucentra.citbanco.Citasbanc.controlador;

import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import co.ucentra.citbanco.Citasbanc.servicios.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    // Endpoint para listar citas del día
    @GetMapping("/dia")
    public ResponseEntity<List<Cita>> listarCitasDelDia() {
        List<Cita> citas = citaService.listarCitasDelDia();
        return ResponseEntity.ok(citas);
    }
}


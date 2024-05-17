package co.ucentra.citbanco.Citasbanc.controlador;


import co.ucentra.citbanco.Citasbanc.entidades.Cita;
import co.ucentra.citbanco.Citasbanc.servicios.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping("/citas/solicitar")
    public ResponseEntity<String> solicitarCita(@RequestBody Cita cita) {
        citaService.guardarCita(cita);
        return ResponseEntity.ok("Cita solicitada exitosamente");
    }

    @GetMapping("/citas/dia")
    public ResponseEntity<List<Cita>> listarCitasDelDia(@RequestParam String sede, @RequestParam(required = false) String tipoServicio) {
        LocalDate fechaHoy = LocalDate.now();
        List<Cita> citas = citaService.listarCitasDelDia(fechaHoy, sede, tipoServicio);
        return ResponseEntity.ok(citas);
    }
}

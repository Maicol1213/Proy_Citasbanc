package co.ucentra.citbanco.Citasbanc.excepciones;


public class CitaNotFoundException extends RuntimeException {
    public CitaNotFoundException(String mensaje) {
        super(mensaje);
    }
}

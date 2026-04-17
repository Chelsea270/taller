package TallerAbstraccion;

public class Cita {
    private String fecha;
    private String hora;
    private String motivo;
    private String veterinarioAsignado;

    public Cita(String fecha, String hora, String motivo, String veterinarioAsignado) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.veterinarioAsignado = veterinarioAsignado;
    }

    public void registrarDiagnostico(String diagnostico) {
        System.out.println("Diagnóstico registrado: " + diagnostico);
    }

    public void cancelarCita() {

        System.out.println("Cita del " + fecha + " a las " + hora + " cancelada.");
    }
    public String getFecha() {
        return fecha;
    }

    public void modificarCita(String nuevaHora, String nuevaFecha, String nuevoMot) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        this.motivo = nuevoMot;
    }

}


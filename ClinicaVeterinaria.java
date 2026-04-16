package TallerAbstraccion;
public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Dueno dueno1 = new Dueno("Carlos Pérez", "8888-1234", "Managua");
        Mascota mascota1 = new Mascota("Firulais", "Perro", 5);
        Cita cita1 = new Cita("20/04/2026", "10:00 AM", "Vacunación", "Dr. López");

        dueno1.registrarMascota(mascota1);
        mascota1.agregarCita(cita1);
        cita1.registrarDiagnostico("Mascota saludable, vacuna aplicada.");
    }
}


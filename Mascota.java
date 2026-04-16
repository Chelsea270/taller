package TallerAbstraccion;

class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void agregarCita(Cita cita) {
        System.out.println("Cita agregada para la mascota " + nombre + " el " + cita.getFecha());
    }

    public void mostrarHistorial() {
        System.out.println("Mostrando historial médico de " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
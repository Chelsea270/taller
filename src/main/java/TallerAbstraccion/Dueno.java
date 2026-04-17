package TallerAbstraccion;

class Dueno {
    private String nombre;
    private String telefono;
    private String direccion;

    public Dueno(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void registrarMascota(Mascota  mascota) {
        System.out.println("Mascota " + mascota.getNombre() + " registrada a nombre de " + nombre);
    }

    public void actualizarDatos(String telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
        System.out.println("Datos actualizados para " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
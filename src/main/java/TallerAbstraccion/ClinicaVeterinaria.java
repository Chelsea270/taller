package TallerAbstraccion;

import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dueno dueno1 = new Dueno("Carlos Pérez", "8888-1234", "Managua");
        Mascota mascota1 = new Mascota("Firulais", "Perro", 5);

        dueno1.registrarMascota(mascota1);

        System.out.println( " -- BIENVENIDO A LA CLINICA VETERINARIA ' Los Arcos ' ");

        Cita cita1 = new Cita("20/04/2026", "10:00 AM", "Vacunación", "Dr. López");

        mascota1.agregarCita(cita1);

        System.out.println(" Se ha realizado la cita a nombre de "+ dueno1.getNombre() + "para el dia "+ cita1.getFecha());

        cita1.registrarDiagnostico("Mascota saludable, vacuna aplicada.");

        System.out.println(" ¿Desea modificar la cita? ");
        String respuesta = sc.nextLine().trim();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Inserte el nombre de la nueva fecha: ");
            String nuevaFecha = sc.nextLine();
            System.out.println("Inserte la hora deseada: ");
            String nuevaHora = sc.nextLine();
            System.out.println("motivo de la cita: ");
            String nuevoMont = sc.nextLine();

            cita1.modificarCita(nuevaHora, nuevaFecha, nuevoMont);

            System.out.println(" ¡Actualizacion exitosa de los datos! fecha de la cita: "+ nuevaFecha +
                    " a las: "+ nuevaHora + " por: "+ nuevoMont);
        }
        else {
            System.out.println("¡Cita guardada exitosamente!");
        }


    }
}


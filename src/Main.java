import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPuertas(10);
        auto1.setColor("Blanco");
        auto1.imprimirColorPuertas(1);

        Duenio duenio1 = new Duenio("Pablo", 208059464, 28, 'M');
        //duenio1.imprimirDuenio();

        Motor motor1 = new Motor(2.0, "Diesel");
        motor1.imprimirMotor();
        System.out.println("----------------------------------------");
        auto1.setMotor(motor1);
        auto1.getMotor().imprimirMotor();
        auto1.setDuenio(duenio1);
        auto1.getDuenio().imprimirDuenio();

        System.out.println("------------------------------------------------------");

        Duenio duenio2= new Duenio("Juan", 1758496240, 34, 'M');
        Motor motor2 = new Motor(4.0, "Extra");

        Auto auto2 = new Auto(4, "Rojo", 3, motor2, duenio2);
        auto2.imprimirColorPuertas(2);
        auto2.getDuenio().imprimirDuenio();
        auto2.getMotor().imprimirMotor();

        System.out.println("------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de ruedas: ");
        int numRuedas = sc.nextInt();
        System.out.println("Ingrese el color del vehiculo: ");
        String color = sc.next();
        System.out.println("Ingrese el numero de puertas: ");
        int numPuertas = sc.nextInt();
        System.out.println("Ingrese el cilindraje del motor: ");
        double cilindraje = sc.nextDouble();
        System.out.println("Ingrese el tipo de combustible: ");
        String combustible = sc.next();
        Motor motor3 = new Motor(cilindraje,combustible);
        System.out.println("Ingrese el nombre del dueño: ");
        String nombre = sc.next();
        System.out.println("Ingrese edad del dueño");
        int edad = sc.nextInt();
        System.out.println("Ingrese la cedula del dueño: ");
        int cedula = sc.nextInt();
        System.out.println("Ingrese el genero del dueño: ");
        char genero = sc.next().charAt(0);
        Duenio duenio3 = new Duenio(nombre,cedula,edad,genero);
        Auto auto3 = new Auto(numRuedas, color, numPuertas, motor3, duenio3);
        auto3.imprimirColorPuertas(3);
        auto3.getMotor().imprimirMotor();
        auto3.getDuenio().imprimirDuenio();

    }
}

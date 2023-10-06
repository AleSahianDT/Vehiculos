// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPuertas(10);
        auto1.setColor("Blanco");
        auto1.imprimirColorPuertas(1);

        Duenio duenio1 = new Duenio("Pablo", 1725490674, 28, 'M');
        duenio1.imprimirDuenio();

        Motor motor1 = new Motor(2.0, "Diesel");
        motor1.imprimirMotor();
        System.out.println("----------------------------------------");
        auto1.setMotor(motor1);
        auto1.getMotor().imprimirMotor();
        auto1.setDuenio(duenio1);
        auto1.getDuenio().imprimirDuenio();

        System.out.println("------------------------------------------------------");

        Duenio duenio2= new Duenio("Juan", 171551028, 34, 'M');
        Motor motor2 = new Motor(4.0, "Extra");

        Auto auto2 = new Auto(4, "Rojo", 3, motor2, duenio2);
        auto2.imprimirColorPuertas(2);
        auto2.getDuenio().imprimirDuenio();
        auto2.getMotor().imprimirMotor();

    }
}

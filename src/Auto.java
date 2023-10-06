public class Auto {
   private int numeroRuedas=0;
   private String color="";
   private int puertas=0;

   private Motor motor;
   private Duenio duenio;

   public Auto(){

   }
   //constructor es un metodo (especial)

   public Auto(int numeroRuedas, String color, int puertas){
      this.numeroRuedas=numeroRuedas;
      this.color=color;
      this.puertas=puertas;
   }

   public Auto(int numeroRuedas, String color, int puertas, Motor motor, Duenio duenio) {
      this.numeroRuedas = numeroRuedas;
      this.color = color;
      this.puertas = puertas;
      this.motor = motor;
      this.duenio = duenio;
   }

   public Auto(Motor motor, Duenio duenio) {
      this.motor = motor;
      this.duenio = duenio;
   }

   public int getPuertas() {
      return puertas;
   }

   public void setPuertas(int puertas) {
      this.puertas = puertas;
   }

   public int getNumeroRuedas() {
      return numeroRuedas;
   }

   public void setNumeroRuedas(int numeroRuedas) {
      this.numeroRuedas = numeroRuedas;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public Motor getMotor() {
      return motor;
   }

   public void setMotor(Motor motor) {
      this.motor = motor;
   }

   public Duenio getDuenio() {
      return duenio;
   }

   public void setDuenio(Duenio duenio) {
      this.duenio = duenio;
   }

   public void imprimirColorPuertas(){
      System.out.println("El color del vehiculo es: "+color+" y el numero de puertas es: "+puertas);
   }

   public void imprimirColorPuertas(int numAuto){
      System.out.println("El color del vehiculo "+numAuto+" es: "+color+" y el numero de puertas es: "+puertas);
   }
   //sobrecargas, mismo metodo, distintas acciones o parametros de entradas

}

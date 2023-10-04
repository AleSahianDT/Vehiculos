public class Duenio {
    private String nombre;
    private int cedula;
    private int edad=0;
    private char genero;

    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println(my);
        }else{
            my="Es menor de edad";
            System.out.println(my);
        }
        return my;
    }
}

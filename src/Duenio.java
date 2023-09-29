public class Duenio {
    String nombre;
    int cedula;
    int edad=0;
    char genero;
    String tipoSangre;

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

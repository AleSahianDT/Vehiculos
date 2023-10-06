public class Duenio {
    private String nombre;
    private int cedula;
    private int edad=0;
    private char genero;

    public Duenio(){

    }

    public Duenio(String nombre, int cedula, int edad, char genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

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
    public void imprimirDuenio(){
        System.out.println("El nombre del dueño es: "+nombre+", su cedula es "+cedula+", su edad es "+edad+", y su genero es "+genero);
    }

}

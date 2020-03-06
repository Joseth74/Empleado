package empleo;


public class Empleo {
   

    private String nombre;
    
    public Empleo(){
    }
    public Empleo(String nombre){
    this.nombre = nombre;
    }
    
    public String GetNombre(){
    return nombre;
    }
    @Override
    public String toString(){
       return "Empleado"+nombre;
    }

}

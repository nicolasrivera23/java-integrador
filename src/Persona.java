public class Persona {

    private String nombre = "";
    private String apellido = "";
    private double sueldo = 0.0;
    private Domicilio domicilio;

    //Constructor 
    public Persona(){}

    public Persona(String n, String a, double s) {
        this.nombre = n;
        this.apellido = a;
        this.sueldo = s;
    }

    public Persona(String n, String a) {
        this.nombre = n;
        this.apellido = a;
    }

    //setter nombre
    public void setNombre(String n) {
        this.nombre = n;
    } 

    //getter nombre
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //setter sueldo
    public void setSueldo(double s) {
        if(s < 100000) {
            s = 120000;
        }
        this.sueldo = s;
    }

    //getter sueldo
    public double getSueldo() {
        return this.sueldo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String toString() {
        return "Nombre Completo: " + this.nombre + " " + this.apellido + "\n" +
        "Sueldo: " + this.getSueldo() + "\n" +
        "Domicilio: " + getDomicilio();
    }
    
}

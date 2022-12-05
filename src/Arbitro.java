public class Arbitro {

    private int edad;
    private String nombre;
    

    //setter
    public void setEdad(int e){
        this.edad = e;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Arbitro [edad=" + edad + ", nombre=" + nombre + "]";
    }

}

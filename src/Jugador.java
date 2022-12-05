public class Jugador extends Persona {
    
    private double cotizacion = 0.0;

    public Jugador(){}

    public Jugador(String n, String a, double s, double c) {
        setNombre(n);
        setApellido(a);
        setSueldo(s);
        setCotizacion(c);
    }

    public double getCotizacion() {
        return this.cotizacion;
    }

    public void setCotizacion(double c) {
        this.cotizacion = c;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "Valor en el mercado: " + getCotizacion();
    }
    
}

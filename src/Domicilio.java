public class Domicilio {

    private String calle = "";
    private String numero = "";
    private String localidad = "";

    public Domicilio(String c, String n, String l) {
        setCalle(c);
        setNumero(n);
        setLocalidad(l);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String toString() {
        return "Calle: " + getCalle() + "\n" +
        "Nro: " + getNumero() + "\n" +
        "Localidad: " + getLocalidad();
    }
    
}

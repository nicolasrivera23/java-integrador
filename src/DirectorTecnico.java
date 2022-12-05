public class DirectorTecnico extends Persona {

    
    public DirectorTecnico(String n, String a, double s) {
        setNombre(n);
        setApellido(a);
        setSueldo(s);
    }

    public String plantearEsquema(int n) {
        String mensaje = "";
        if(n == 1) {
            mensaje = "Se planteó una táctica de 4-4-2";
        }
        if(n == 2) {
            mensaje = "Se planteó una táctica de 5-4-1";
        }
        if(n == 3) {
            mensaje = "Se planteó una táctica de 3-4-3";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre = "";
    private DirectorTecnico directorTecnico = null;
    private List<Jugador> jugadores = new ArrayList<>();

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    //obtener Jugador
    public void obtenerJugador(int n) {
        System.out.println(jugadores.get(n));
    }

    //editar jugador
    public void editarJugador(int i, Jugador j) {
        this.jugadores.set(i, j);
    }

    //agregar jugador
    public void convocarJugador(Jugador j) {
        this.jugadores.add(j);
    }

    //eliminar jugador
    public void eliminarJugador(Jugador j) {
        this.jugadores.remove(j);
    }

    public void listarConvocados() {
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }

    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
        "DT: " + getDirectorTecnico() + "\n" +
        "Cant. total Jugadores: " + jugadores.size();
    }
    
}

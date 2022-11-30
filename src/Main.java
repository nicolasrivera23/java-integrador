public class Main {

    public static void main(String[] args) {

        Persona personaUno = new Persona();
        Persona personaDos = new Persona("Julián", "Alvarez", 150000);
        Persona personaTres = new Persona("nombre", "apellido");
        personaTres.setSueldo(90000);


        Jugador jugadorUno = new Jugador();
        jugadorUno.setNombre("Nicolás");
        jugadorUno.setApellido("Otamendi");
        jugadorUno.setCotizacion(1000000);

        Jugador jugadorDos = new Jugador("Angel", "Di María", 20000, 300000);

        Jugador jugadorTres = new Jugador("Angel", "Di María2", 30000, 300000);

        DirectorTecnico dtUno = new DirectorTecnico("Leonel", "Scaloneta", 60000);

        Domicilio domUno = new Domicilio("Av Siempreviva", "1234", "Springfield");
        dtUno.setDomicilio(domUno);

        Equipo equipoUno = new Equipo();
        equipoUno.setNombre("Argentina");
        equipoUno.setDirectorTecnico(dtUno);
        equipoUno.convocarJugador(jugadorDos);
        equipoUno.convocarJugador(jugadorUno);

        //System.out.println(equipoUno);
        //equipoUno.eliminarJugador(jugadorDos);

        equipoUno.editarJugador(0, jugadorTres);

        equipoUno.listarConvocados();
    }
    
}

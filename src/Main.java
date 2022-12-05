public class Main {

    public static void main(String[] args) {

        Jugador jugadorUno = new Jugador();
        jugadorUno.setNombre("Nicolás");
        jugadorUno.setApellido("Otamendi");
        jugadorUno.setCotizacion(1000000);

        Jugador jugadorDos = new Jugador("Angel", "Di María", 20000, 300000);

        Jugador jugadorTres = new Jugador("Julián", "Alvarez", 20000, 300000);

        Jugador jugadorCuatro = new Jugador("Angel", "Di María2", 30000, 300000);

        DirectorTecnico dtUno = new DirectorTecnico("Leonel", "Scaloneta", 60000);

        Domicilio domUno = new Domicilio("Av Siempreviva", "1234", "Springfield");
        dtUno.setDomicilio(domUno);

        Equipo equipoUno = new Equipo();
        equipoUno.setNombre("Argentina");
        equipoUno.setDirectorTecnico(dtUno);

        equipoUno.convocarJugador(jugadorDos);
        equipoUno.convocarJugador(jugadorUno);
        equipoUno.convocarJugador(jugadorTres);

        equipoUno.obtenerJugador(2);

        //equipoUno.editarJugador(0, jugadorCuatro);
        //equipoUno.eliminarJugador(jugadorDos);

        //equipoUno.listarConvocados();
        //System.out.println(equipoUno);
        //equipoUno.eliminarJugador(jugadorDos);

        //equipoUno.editarJugador(0, jugadorTres);

        //equipoUno.listarConvocados();
        //System.out.println(jugadorUno);
    }
    
}

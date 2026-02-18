public class Game{
    private Board tablero;
    private Player[] jugadores;
    private int jugadorActual=0;

    public Game(Board tablero, Player[] jugadores, int jugadorActual){
        this.tablero=tablero;
        this.jugadores=jugadores;
        this.jugadorActual=jugadorActual;
    }

}
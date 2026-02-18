public class Player{
    private int jugador;
    private Token ficha;

    public Player(int jugador, Token ficha){
        this.jugador=jugador;
        this.ficha=ficha;
    }

    public int getJugador() {
        return jugador;
    }

    public Token getFicha() {
        return ficha;
    }
}
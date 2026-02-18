public class Player{
    private String nombre;
    private Token ficha;

    public Player(String nombre, Token ficha){
        this.nombre=nombre;
        this.ficha=ficha;
    }

    public int getNombre() {

        return nombre;

    }

    public Token getFicha()
    {
        return ficha;
    }
}
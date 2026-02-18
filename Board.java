public class Board {
    public final int filas=6;
    public final int columnas=7;
    String [][] matriz = new String[filas][columnas];
    public Board(){
        rellenarTablero();
    }

    public void rellenarTablero(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=" ";
            }
        }

    }

    public void printBoard(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("|" + matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    public boolean dropToken(int columna, String simbolo){
        for (int i = fila-1; i <0  ; i--) {
            if(!matriz[i][columna].equals(simbolo)){
                matriz[i][columna]=simbolo;
                return true;
            }
        }
        return false;
    }
}
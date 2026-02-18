public class Board {
    public final int filas=6;
    public final int columnas=7;
    int [][] matriz = new int[filas][columnas];
    public Board(){

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
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }

    public boolean dropToken(int columna, Token simbolo){
        for (int i = fila.lenght-1; i <0  ; i--) {
            if(matriz[i][columna].equals(simbolo)){

            }
        }

    }
}
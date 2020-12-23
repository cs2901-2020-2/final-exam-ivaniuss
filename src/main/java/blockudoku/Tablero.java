package blockudoku;

import java.util.Random;

public class Tablero {
    private final char [][] table;


    public Tablero(){
        table = new char[9][9];
        llenarTablero();
    }


    public void llenarTablero(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = 'x';
            }
        }
    }


    public void dibujarTablero(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print( String.format("%s ",table[i][j]));
            }
            System.out.println();
        }
    }
    public boolean jugar(int posX, int posY, Pieza pieza){
        if (posX < 9 && posY <9 && table[posX][posY] == 'x'){

        }
        return true;
    }

    public Pieza generarPiezaRandom(){
        Random random = new Random();
        int tipoPieza = random.nextInt(8);
        return new Pieza(((char) tipoPieza));
    }

    public int tableroSize(){
        return table.length;
    }
}

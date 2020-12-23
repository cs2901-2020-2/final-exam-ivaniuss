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

    public char generarPiezaRandom(){
        Random random = new Random();
        int tipoPieza = random.nextInt(8);
        tipoPieza = tipoPieza + 97;
        return (char) tipoPieza;
    }

    public int tableroSize(){
        return table.length;
    }

    public boolean bloqueGanador(){
        boolean win = false;

        if(validarSubCUadrado(0, 3, 0, 3)
                || validarSubCUadrado(0, 3, 3, 6)
                || validarSubCUadrado(0, 3, 6, 9)
                || validarSubCUadrado(3, 6, 0, 3)
                || validarSubCUadrado(3, 6, 3, 6)
                || validarSubCUadrado(3, 6, 6, 9)
                || validarSubCUadrado(6, 9, 0, 3)
                || validarSubCUadrado(6, 9, 3, 6)
                || validarSubCUadrado(6, 9, 6, 9)
        ){
            win = true;
        }
        else if(validarFila(0)
                || validarFila(1)
                || validarFila(2)
                || validarFila(3)
                || validarFila(4)
                || validarFila(5)
                || validarFila(6)
                || validarFila(7)
                || validarFila(8)
        ){
            win = true;
        }
        else if(validarColumna(0)
                || validarColumna(1)
                || validarColumna(2)
                || validarColumna(3)
                || validarColumna(4)
                || validarColumna(5)
                || validarColumna(6)
                || validarColumna(7)
                || validarColumna(8)
        ){
            win = true;
        }

        return win;
    }

    public boolean validarSubCUadrado(int i1, int i2, int j1, int j2){
        int count = 0;

        for(int i = i1; i < i2; i++){
            for(int j = j1; j < j2; j++){

                if(table[i][j] == ' '){
                    count++;
                }
            }
        }
        if(count == 9){
            return true;
        }
        return false;
    }
    public boolean validarColumna(int j1){
        int count = 0;
        for(int i = 0; i < 9; i++){
            if(table[i][j1] == ' '){
                    count++;
            }
        }
        if(count == 9){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validarFila(int i1){
        int count = 0;
        for(int j = 0; j < 9; j++){
            if(table[i1][j] == ' '){
                count++;
            }
        }
        if(count == 9){
            return true;
        }
        else {
            return false;
        }
    }

    public void llenarConPieza(int x, int y, char tipoPieza){
        if(tipoPieza == 'a'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y+1 < 9 && y + 2 < 9){
                table[x][y] = ' ';
                table[x+1][y] = ' ';
                table[x+2][y] = ' ';
                table[x+2][y+1] = ' ';
                table[x+2][y+2] = ' ';
            }
        }
        else if( tipoPieza == 'b'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y+1 < 9 && y + 2 < 9) {
                table[x][y] = ' ';
                table[x][y - 1] = ' ';
                table[x][y - 2] = ' ';
                table[x + 1][y] = ' ';
                table[x + 2][y] = ' ';
            }
        }
        else if( tipoPieza == 'c'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y+1 < 9 && y + 2 < 9){
                table[x][y] = ' ';
                table[x][y+1] = ' ';
                table[x][y+2] = ' ';
            }
        }
        else if( tipoPieza == 'd'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y+1 < 9 && y + 2 < 9) {
                table[x][y] = ' ';
                table[x + 1][y] = ' ';
                table[x + 2][y] = ' ';
            }
        }
        else if( tipoPieza == 'e'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y+1 < 9 && y - 1 < 9) {
                table[x][y] = ' ';
                table[x + 1][y] = ' ';
                table[x + 2][y] = ' ';
                table[x + 2][y - 1] = ' ';
                table[x + 2][y + 1] = ' ';
            }
        }
        else if( tipoPieza == 'f'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y - 1 < 9 && y -2 <9) {
                table[x][y] = ' ';
                table[x][y - 1] = ' ';
                table[x][y - 2] = ' ';
                table[x + 1][y - 1] = ' ';
                table[x + 2][y - 1] = ' ';
            }
        }
        else if( tipoPieza == 'g'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y + 1 <9) {
                table[x][y] = ' ';
                table[x + 1][y] = ' ';
                table[x + 2][y] = ' ';
                table[x + 2][y + 1] = ' ';
            }
        }
        else if( tipoPieza == 'h'){
            if(x < 9 && x+1 < 9 && x + 2 < 9 && y < 9 && y - 1 <9) {
                table[x][y] = ' ';
                table[x][y - 1] = ' ';
                table[x + 1][y - 1] = ' ';
                table[x + 2][y - 1] = ' ';
            }
        }
    }
}

package blockudoku;

public class Pieza {
    private char[][] piece = new char[3][3];

    public Pieza(){

    }
    public Pieza(char tipoPieza){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piece[i][j] = 'x';
            }
        }
        if(tipoPieza == 'a'){
            piece[0][0] = ' ';
            piece[1][0] = ' ';
            piece[2][0] = ' ';
            piece[2][1] = ' ';
            piece[2][2] = ' ';
        }
        else if( tipoPieza == 'b'){
            piece[0][0] = ' ';
            piece[0][1] = ' ';
            piece[0][2] = ' ';
            piece[1][2] = ' ';
            piece[2][2] = ' ';
        }
        else if( tipoPieza == 'c'){
            piece[0][0] = ' ';
            piece[0][1] = ' ';
            piece[0][2] = ' ';
        }
        else if( tipoPieza == 'd'){
            piece[0][0] = ' ';
            piece[1][0] = ' ';
            piece[2][0] = ' ';
        }
        else if( tipoPieza == 'e'){
            piece[0][1] = ' ';
            piece[1][1] = ' ';
            piece[2][1] = ' ';
            piece[2][0] = ' ';
            piece[2][2] = ' ';
        }
        else if( tipoPieza == 'f'){
            piece[0][1] = ' ';
            piece[1][1] = ' ';
            piece[2][1] = ' ';
            piece[0][0] = ' ';
            piece[0][2] = ' ';
        }
        else if( tipoPieza == 'g'){
            piece[0][0] = ' ';
            piece[1][0] = ' ';
            piece[2][0] = ' ';
            piece[2][1] = ' ';
        }
        else if( tipoPieza == 'h'){
            piece[0][0] = ' ';
            piece[1][0] = ' ';
            piece[2][0] = ' ';
            piece[0][1] = ' ';
        }

    }
}

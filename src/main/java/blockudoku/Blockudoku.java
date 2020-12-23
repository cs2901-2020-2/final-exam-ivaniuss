package blockudoku;

import java.util.Random;
import java.util.Scanner;

public class Blockudoku {
    public static void main(String[] args) {
        int puntos = 0;
        boolean win = false;
        Scanner myObj = new Scanner(System.in);
        String restart = null;
        Tablero tablero = new Tablero();
        tablero.dibujarTablero();
        while(win == false){

            System.out.print("Enter x if you want re-start the game or press enter to continue");
            restart = myObj.nextLine();
            if(restart == "x"){
                tablero.llenarTablero();
            }
            else{
                System.out.println("Enter the pos x");
                int posX = myObj.nextInt();
                System.out.println("Enter the pos y");
                int posY = myObj.nextInt();
                char positionPiece = tablero.generarPiezaRandom();
                tablero.llenarConPieza(posX, posY, positionPiece);
                tablero.dibujarTablero();
                if(tablero.bloqueGanador()){
                    System.out.println("Usted ha ganado");
                    win = true;
                }
            }
        }



    }


}

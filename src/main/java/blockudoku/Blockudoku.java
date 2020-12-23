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
        while(win == false){
            tablero.dibujarTablero();
            System.out.println("Enter x if you want re-start the game");
            restart = myObj.nextLine();
            if(restart == "x"){
                tablero.llenarTablero();
            }
            else{
                int posX;
                int posY;

                Pieza pieza = new Pieza();
                System.out.println("Enter pos x and pos y");
                String posx = myObj.nextLine();
                String posY = myObj.nextLine();

            }
        }



    }


}

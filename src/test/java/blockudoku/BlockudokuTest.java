package blockudoku;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BlockudokuTest {
    public void nuevaPartidaTest(){
        Tablero tablero = new Tablero();
        tablero.dibujarTablero();
        Assert.assertEquals(tablero.tableroSize(), 9);
    }
}

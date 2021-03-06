package bb.teach.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {

    @Test
    public void testGetName() throws Exception {

        final String inputValue = "Gaga";
        final String expectedValue = inputValue; // ожидаемое значение

        final Player player = new Player(inputValue, null);

        final  String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {

        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue; // ожидаемое значение

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);

    }
}
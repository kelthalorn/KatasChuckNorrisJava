package chucknorris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChuckNorrisTest {

    private ChuckNorris chuckNorris;

    @Before
    public void executedBeforeEach() {
        chuckNorris = new ChuckNorris(false);
    }

    @Test
    public void chuckNorrisShouldReturn00_0IfReceive0() {
        //Given
        chuckNorris.init("0");
        String expected = "00 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn0_0IfReceive1() {
        //Given
        chuckNorris.init("1");
        String expected = "0 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn0_00IfReceive11() {
        //Given
        chuckNorris.init("11");
        String expected = "0 00";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn00_00IfReceive00() {
        //Given
        chuckNorris.init("00");
        String expected = "00 00";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn00_0_0_0IfReceive01() {
        //Given
        chuckNorris.init("01");
        String expected = "00 0 0 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn00_0_0_0IfReceive10() {
        //Given
        chuckNorris.init("10");
        String expected = "0 0 00 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString(0);
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }
}
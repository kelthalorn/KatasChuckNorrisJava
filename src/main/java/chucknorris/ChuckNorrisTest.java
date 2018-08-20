package chucknorris;

import org.junit.Assert;
import org.junit.Test;

public class ChuckNorrisTest {

    @Test
    public void chuckNorrisShouldReturn00_0IfReceive1With1Byte() {
        //Given
        ChuckNorris chuckNorris = new ChuckNorris("1", 1);
        String expected = "00 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString();
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn0_0IfReceiveCWith1Byte() {
        //Given
        ChuckNorris chuckNorris = new ChuckNorris("C", 1);
        String expected = "0 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString();
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }
}
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
    public void chuckNorrisShouldReturn00_0IfReceive1With1Byte() {
        //Given

        chuckNorris.init("0");
        String expected = "00 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString();
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }

    @Test
    public void chuckNorrisShouldReturn0_0IfReceiveCWith1Byte() {
        //Given
        chuckNorris.init("1");
        String expected = "0 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString();
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }
}
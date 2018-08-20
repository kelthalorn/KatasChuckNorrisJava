package chucknorris;

import java.io.Console;

public class ChuckNorris {

    private String binaryString;
    private String output;

    public ChuckNorris(String binaryToParse, int nbBytes) {
        if (nbBytes < binaryToParse.length()) {
            this.binaryString = binaryToParse.substring(nbBytes, -1);
        } else {
            System.out.println("le nombre de bytes doit être strictement inférieur à la taille de la chaîne de caractère");
        }
    }

    public ChuckNorris(String stringToParse) {
        this.output = "";
        byte[] bytes = convertStringToByte(stringToParse);
        this.binaryString = "";
        for (byte current: bytes) {
            this.binaryString += convertByteToBinaryString(current, 6);
        }
    }
    public String getBinaryString() {
        return this.binaryString;
    }

    public String getOutput() {
        return this.output;
    }

    private byte[] convertStringToByte(String asciiString)  {
        return asciiString.getBytes();
    }

    private String convertByteToBinaryString(byte characterInByte, int nbBytes) {
        StringBuilder binary = new StringBuilder();
        
        for (int i = 0; i < nbBytes + 1; i++)
        {
            binary.append((characterInByte & 128) == 0 ? 0 : 1);
            characterInByte <<= 1;
        }

        this.binaryString = binary.toString().substring(1);
        return binaryString;
    }

    public void convertBinaryStringToUnaryString() {

    }
}
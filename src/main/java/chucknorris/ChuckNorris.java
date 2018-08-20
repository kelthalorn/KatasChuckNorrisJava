package chucknorris;

import java.io.Console;

public class ChuckNorris {

    private String binaryString;
    private String output;
    private boolean prod;

    public ChuckNorris(boolean prod) {
        this.output = "";
        this.binaryString = "";
        this.prod = prod;
    }

    public void init(String stringToParse) {
        if (prod) {
            byte[] bytes = convertStringToByte(stringToParse);
            for (byte current : bytes) {
                this.binaryString += convertByteToBinaryString(current);
            }
        } else {
            this.binaryString = stringToParse;
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

    private String convertByteToBinaryString(byte characterInByte) {
        StringBuilder binary = new StringBuilder();
        
        for (int i = 0; i < 7; i++)
        {
            binary.append((characterInByte & 128) == 0 ? 0 : 1);
            characterInByte <<= 1;
        }

        this.binaryString = binary.toString().substring(1);
        return binaryString;
    }

    public void convertBinaryStringToUnaryString() {
        if (this.binaryString.equals("0")) {
            this.output = "00 0";
        } else {
            this.output = "0 0";
        }
    }
}
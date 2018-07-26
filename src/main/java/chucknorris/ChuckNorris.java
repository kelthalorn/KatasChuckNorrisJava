package chucknorris;

public class ChuckNorris {

    private String binaryString;
    private String output;

    public ChuckNorris(String stringToParse) {
        this.output = "";
        byte[] bytes = convertStringToByte(stringToParse);
        this.binaryString = "";
        for (byte current: bytes) {
            this.binaryString += convertByteToBinaryString(current);
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

        this.binaryString = binary.toString();
        return binaryString;
    }

    public void convertBinaryStringToUnaryString() {

    }
}
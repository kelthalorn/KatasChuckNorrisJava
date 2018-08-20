package chucknorris;

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

    public void convertBinaryStringToUnaryString(int byteIndex) {
        String[] currentBinaryString = this.binaryString.split("");
        String currentByteMasterValue = "0";

        if (currentBinaryString[byteIndex].equals("0")) {
            this.output += "00 ";
        } else {
            currentByteMasterValue = "1";
            this.output += "0 ";
        }

        int newByteIndex = searchForCurrentByteRecurrence(currentByteMasterValue, currentBinaryString, byteIndex);
        if (newByteIndex == currentBinaryString.length) {
            if (this.output.charAt(this.output.length() - 1) == ' ') {
                this.output = this.output.substring(0, this.output.length() -1);
            }
            return;
        }

        convertBinaryStringToUnaryString(newByteIndex);
    }

    private int searchForCurrentByteRecurrence(String currentByteMasterValue, String[] currentBinaryString, int byteIndex) {
        String currentRecurrence = "0";
        int index;
        for (index = byteIndex+1; index < currentBinaryString.length; index++) {
            if (currentBinaryString[index].equals(currentByteMasterValue)) {
                currentRecurrence += "0";
            } else {
                this.output += currentRecurrence + " ";
                return index;
            }
        }
        this.output += currentRecurrence + " ";
        return index;
    }
}
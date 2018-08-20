package chucknorris;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChuckNorrisJavaKata {

    public static void main (String[] args) {
        ChuckNorris chuckNorris = new ChuckNorris(readUserInput());
        System.out.println(chuckNorris.getBinaryString());
    }   
    
    private static String readUserInput() {
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
        }        
        
        return input;
    }
}

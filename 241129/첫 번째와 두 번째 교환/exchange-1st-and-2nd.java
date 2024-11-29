import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char firstWord = input.charAt(0);
        char secondWord = input.charAt(1);
        // codctrcc
        // 

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == firstWord) { // secondWord로 교체
                input = input.substring(0,i) + secondWord + input.substring(i+1);
                continue;
            }
            else if (input.charAt(i) == secondWord) { // firstWord로 교체
                input = input.substring(0,i) + firstWord + input.substring(i+1);
                continue;
            }
        }

        bw.write(input);
        bw.flush();
        bw.close();
    }
}
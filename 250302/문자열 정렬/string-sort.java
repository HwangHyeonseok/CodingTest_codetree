import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] inputArr = input.toCharArray();
        
        Arrays.sort(inputArr);
        
        for(int i=0; i<inputArr.length; i++) {
            bw.write(inputArr[i]);
        }

        bw.flush();
        bw.close();
    }
}
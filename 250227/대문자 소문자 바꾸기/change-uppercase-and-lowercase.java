import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        
        char[] inputArr = input.toCharArray();

        // logic // 
        for(int i=0; i<inputArr.length; i++) {
            if(inputArr[i] >= 'A' && inputArr[i] <= 'Z') {
                inputArr[i] = (char)(inputArr[i]+32);
            }
            else if(inputArr[i] >= 'a' && inputArr[i] <= 'z') {
                inputArr[i] = (char)(inputArr[i]-32);
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        for(char c : inputArr) {
            sb.append(c);
        }

        // output //
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
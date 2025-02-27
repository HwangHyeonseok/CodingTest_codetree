import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                sb.append(input.charAt(i));
            }

            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                sb.append((char)(input.charAt(i)-32)); 
            }
        }
        
        // output //
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // logic // 
        String ans ="";
        StringBuilder sb;
        String input = br.readLine();

        while(!input.equals("END")) {
            sb = new StringBuilder(input);
            ans = sb.reverse().append("\n").toString();
            bw.write(ans);
            input = br.readLine();
        }
        
        // output //
        bw.flush();
        bw.close();
    }
}
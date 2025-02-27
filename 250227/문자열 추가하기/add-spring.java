import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        StringBuilder sb = new StringBuilder(input);
        sb.append("Hello");

        String ans = sb.toString(); // StringBuilder -> String 타입
        
        // output //
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
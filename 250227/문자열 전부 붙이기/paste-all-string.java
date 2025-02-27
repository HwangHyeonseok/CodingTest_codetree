import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String input;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++) {
            input = br.readLine();
            sb.append(input);
        }
        
        String ans = sb.toString();
        // output //
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
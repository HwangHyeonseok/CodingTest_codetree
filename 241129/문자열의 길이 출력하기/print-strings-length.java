import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = new String[2];
        for(int i=0; i<2; i++) {
            input[i] = br.readLine();
        }
        
        int ans = 0;
        for(int i=0; i<2; i++) {
            ans += input[i].length();
        }
        
        bw.write(ans+"");
        bw.flush();
        bw.close();

    }
}
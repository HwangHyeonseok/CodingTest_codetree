import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char find = br.readLine().charAt(0);

        // logic //
        int ans = 0;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == find) ans++;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
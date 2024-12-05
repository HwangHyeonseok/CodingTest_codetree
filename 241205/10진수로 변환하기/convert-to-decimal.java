import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        int ans = 0;
        int weight = 1; // 가중치
        for(int i=input.length()-1; i>=0; i--) {
            ans += (input.charAt(i) -'0') * weight;
            weight *= 2;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
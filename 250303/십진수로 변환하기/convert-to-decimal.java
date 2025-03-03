import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] inputArr = input.toCharArray();

        // logic // 
        int weight = 1; // 가중치
        int ans = 0;
        for(int i=inputArr.length-1; i>=0; i--) {
            ans += (int)(inputArr[i]-'0') * weight;
            weight = weight *2;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
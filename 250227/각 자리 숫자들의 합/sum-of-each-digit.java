import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] inputArr = input.toCharArray();

        // logic // 
        int ans = 0;
        for(int i=0; i<inputArr.length; i++) {
            ans += (int)(inputArr[i]-'0');
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
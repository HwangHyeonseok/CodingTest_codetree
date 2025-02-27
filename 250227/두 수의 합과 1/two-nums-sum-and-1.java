import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        // logic // 
        int plus = num1+num2;
        String plusStr = plus+"";
        
        char[] plusStrChar = plusStr.toCharArray();

        int ans = 0;
        for(int i=0; i<plusStr.length(); i++) {
            if(plusStrChar[i] == '1') ans++;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        int ans = 0;
        for(int i=0; i<input.length(); i++) {
            // 만약 '(' 가 있으면 
            if(input.charAt(i) == '(') {
                // 그 다음부터 ')' 가 있는지 찾는다.
                for(int j=i; j<input.length(); j++) {
                    if(input.charAt(j) == ')') ans++;
                }
            }
            
            // System.out.println(i + "번째 단어에서 ()가 만들어지는 경우의 수(누적) : " + ans); // test
        }
        

        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
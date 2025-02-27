import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        String ans = "";
        char curChar = ' ';
        int combo = 1;
        
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == curChar) combo++;
            else {
                if(i != 0) {
                    ans = ans + curChar + (combo + ""); // 정수 -> 문자열
                    combo = 1;
                }
                curChar = input.charAt(i);
            } 
        }
        // 마지막 문자 처리
        if(curChar != ' ') {
            ans = ans + curChar + (combo + "");
        }
        
        // output //
        bw.write(ans.length()+"\n");
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
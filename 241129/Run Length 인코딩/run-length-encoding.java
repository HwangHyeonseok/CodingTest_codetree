import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        char curChar = ' ';
        String ans = "";

        int combo = 1;
        for(int i=0; i<input.length();i++) {
            if(curChar == ' ') { // 처음
                curChar = input.charAt(i);
                continue;
            }

            else if(curChar != input.charAt(i)) { // 이전과 다른 경우
            // aaa -> a3
                ans += curChar;
                ans += combo+"";
            // 콤보랑 콤보 단어 최신화
                curChar = input.charAt(i);
                combo = 1;

                continue;
            }

            else {
                combo++;
            }
        }

        // aaabbbbcbb 에서 bb(끝 부분)이 처리가 되지 않은 경우
        if(combo >= 1) {
            // aaa -> a3
                ans += curChar;
                ans += combo+"";
        }
        bw.write(ans.length()+"\n");
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
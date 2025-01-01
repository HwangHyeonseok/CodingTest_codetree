import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        String word = st.nextToken();
        int commandCnt = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<commandCnt; i++) {
            int command = Integer.parseInt(br.readLine());
            // 1) 
            // abcd
            // bcda
            if(command == 1) {
                word = word.substring(1) + word.substring(0,1);
            }
            // 2)
            // cdab
            // bcda
            else if(command == 2) {
                word = word.substring(word.length()-1) + word.substring(0,word.length()-1);
            }

            // 3)
            // abcd
            // dcba
            else if(command == 3) {
                StringBuffer sb = new StringBuffer(word); // word 라는 문자열을 StringBuilder 형으로 변경하여 sb 객체에 담는다.
                word = sb.reverse().toString(); // 문자열을 뒤집고 다시 String 형으로 변경하여 word에 삽입
            }

            bw.write(word+"\n");
        }

        bw.flush();
        bw.close();
    }
}







// Ex
// abcd
// bcda // 1
// cdab // 1
// bcda // 2
// adcb // 3

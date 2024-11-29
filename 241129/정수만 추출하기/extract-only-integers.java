import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        String input1 = st.nextToken();
        String input2 = st.nextToken();
        
        String ansTempStr = "";
        int ans = 0;

        // 1번째 문자열 숫자만 추출하기
        for(int i=0; i<input1.length(); i++) {
            if(input1.charAt(i) < '0' || input1.charAt(i) > '9') { // 숫자가 아닌 경우 
                break;
            }
            else {
                ansTempStr += input1.charAt(i);
            }
        }

        ans += Integer.parseInt(ansTempStr);
        ansTempStr = "";
        
        // 2번째 문자열 숫자만 추출하기
        for(int i=0; i<input2.length(); i++) {
            if(input2.charAt(i) < '0' || input2.charAt(i) > '9') { // 숫자가 아닌 경우 
                break;
            }
            else {
                ansTempStr += input2.charAt(i);
            }
        }

        ans += Integer.parseInt(ansTempStr);

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
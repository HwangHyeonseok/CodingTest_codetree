import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine(); // 입력 받기

        StringTokenizer st = new StringTokenizer(input, " "); // 공백(" ") 을 기준으로 분리
        int a = Integer.parseInt(st.nextToken()); // 첫 번째 값
        int b = Integer.parseInt(st.nextToken()); // 두 번째 값

        bw.write(String.format("%d", a*b));
        bw.flush();
        bw.close();
    }
}
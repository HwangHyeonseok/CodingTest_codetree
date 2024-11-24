import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1 2 입력 받기 
        String inputLine = br.readLine();
        StringTokenizer st = new StringTokenizer(inputLine, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 3 입력 받기
        int c = Integer.parseInt(br.readLine());

        bw.write(String.format("%d %d %d", a,b,c));
        bw.flush();
        bw.close();
    }
}
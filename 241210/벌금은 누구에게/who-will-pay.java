import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] students = new int[N+1]; // N명의 학생이 받은 벌칙 횟수 (0인덱스는 따지지 않음)
        
        // logic //
        int ans = -1;

        for(int i=0; i<K; i++) {
            int bomb = Integer.parseInt(br.readLine());
            students[bomb]++;
            if(students[bomb] >= M) {
                ans = bomb;
                break;
            }
        }

        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
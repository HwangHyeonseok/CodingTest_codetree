import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // input //
        int N = Integer.parseInt(br.readLine());
        int[] board = new int[N];

        for(int i=0; i<N; i++) {
            board[i] = Integer.parseInt(br.readLine());
        }

        // logic //
        int cnt = 0;
        int ans = 0;

        for(int i=0; i<board.length; i++) {
            if(i == 0 || board[i] == board[i-1]) {
                cnt++;
            }
            else {
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
        }

        ans = Math.max(ans, cnt); // 뒷 인덱스 적용

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
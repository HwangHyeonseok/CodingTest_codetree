import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] board = new int[N];

        for(int i=0; i<N; i++) {
            board[i] = Integer.parseInt(br.readLine());
        }

        // logic //
        int ans = 0;
        int cnt = 0;
        for(int i=0; i<board.length; i++) {
            if(i==0 || board[i] > board[i-1]) cnt++;
            else {
                ans = Math.max(ans,cnt);
                cnt = 1;
            }
        }
        // 마지막 처리
        ans = Math.max(ans, cnt);
        
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
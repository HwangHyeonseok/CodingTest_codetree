import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // logic //
        int[][] board = new int[n][n];
        int ans = 1;
        int[] moveR = {-1,1};
        int[] moveC = {0,0};
        int curR = n-1;
        int curC = 0;
        int moveIdx = 0;
        for(int c=n-1; c >= 0; c--) {
            curC = c;
            board[curR][curC] = ans;
            ans++;

            while(true) {
                int nextR = curR + moveR[moveIdx];
                int nextC = curC + moveC[moveIdx];
                if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= n) {
                    moveIdx = ++moveIdx % 2;
                    break;
                }
                
                board[nextR][nextC] = ans;
                curR = nextR;
                curC = nextC;
                ans++;
            }
        }

        // output //
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                bw.write(board[r][c]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
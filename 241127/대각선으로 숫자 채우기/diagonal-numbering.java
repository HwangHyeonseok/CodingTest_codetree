import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // logic //
        int[][] board = new int[n][m];
        int ans = 1;

        // → 으로 가면서 사선 이동
        for(int c=0; c<n; c++) { 
            int curR = 0;
            int curC = c;
            board[curR][curC] = ans;
            ans++;

            while(true) {
                int nextR = curR + 1;
                int nextC = curC - 1;
                if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= m) break;

                board[nextR][nextC] = ans;
                ans++;
                curR = nextR;
                curC = nextC;
            }
        }

        // ↓ 으로 가면서 사선 이동
        for(int r=1; r<n; r++) {
            int curR = r;
            int curC = m-1;
            board[curR][curC] = ans;
            ans++;

            while(true) {
                int nextR = curR + 1;
                int nextC = curC - 1;
                if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= m) break;

                board[nextR][nextC] = ans;
                ans++;
                curR = nextR;
                curC = nextC;
            }
        }

        // output //
        for(int r=0; r<n; r++) {
            for(int c=0; c<m; c++) {
                bw.write(board[r][c]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
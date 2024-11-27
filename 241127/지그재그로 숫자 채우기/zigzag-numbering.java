import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // input //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // firstLine
        String firstLine = br.readLine();
        StringTokenizer stLine = new StringTokenizer(firstLine, " ");
        int n = Integer.parseInt(stLine.nextToken());
        int m = Integer.parseInt(stLine.nextToken());

        // logic //
        int[][] board = new int[n][m];
        int ans = 0;
        for(int c=0; c<m; c++) {

            if(c % 2 == 0) { // ↓
                for(int r=0; r<n; r++) {
                    board[r][c] = ans;
                    ans++;
                }
            }

            else {
                for(int r=n-1; r>=0; r--) {
                    board[r][c] = ans;
                    ans++;
                }
            }
        }

        // output //
        for(int r=0; r<n; r++) {
            for(int c=0; c<m; c++) {
                bw.write(String.format("%d ", board[r][c]));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
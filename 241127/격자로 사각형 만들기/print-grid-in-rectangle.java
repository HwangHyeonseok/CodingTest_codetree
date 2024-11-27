import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        // logic //
        int[][] board = new int[n][n];
        // 1) [0][0~n] 과 [0~n][0] 을 모두 1로 채우기
        for(int r=0; r<n; r++) {
            board[r][0] = 1;
        }
        for(int c=0; c<n; c++) {
            board[0][c] = 1;
        }

        // 2) 안쪽 채우기
        for(int r=1; r<n; r++) {
            for(int c=1; c<n; c++) {
                board[r][c] = board[r-1][c] + board[r][c-1] + board[r-1][c-1];
            }
        }

        // 3) 출력
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                bw.write(board[r][c] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
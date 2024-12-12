import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 101;
    static int[][] board = new int[MAX_N][MAX_N];
    // 우 하 좌 상 으로 이동
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    static int dir = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        int n = Integer.parseInt(st.nextToken()); // 행
        int m = Integer.parseInt(st.nextToken()); // 열

        int curR = 0;
        int curC = 0;
        board[curR][curC] = 1;
        
        for(int i=0; i<n*m-1; i++) {
            int nextR = dr[dir%4] + curR;
            int nextC = dc[dir%4] + curC;
            if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= m || board[nextR][nextC] != 0) {
                dir += 1;
                nextR = dr[dir%4] + curR;
                nextC = dc[dir%4] + curC;
                // System.out.println("현재 nextR : " + nextR + " 현재 nextC : " + nextC + " 현재 dir : " + dir%4);
            }
            board[nextR][nextC] = board[curR][curC] + 1;
            curR = nextR;
            curC = nextC;
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
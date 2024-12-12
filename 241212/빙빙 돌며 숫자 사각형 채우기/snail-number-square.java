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

        int r = 0;
        int c = 0;
        board[r][c] = 1;
        
        for(int i=2; i<=n*m; i++) {
            int nr = dr[dir] + r;
            int nc = dc[dir] + c;
            // 맵 범위를 벗어나거나 이미 방문한 경우 방향을 바꿔준다.
            if(nr < 0 || nc < 0 || nr >= n || nc >= m || board[nr][nc] != 0) {
                dir = (dir + 1) % 4;
            }

            r = r + dr[dir];
            c = c + dc[dir];
            board[r][c] = i;
        }


        
        // output //
        for(r=0; r<n; r++) {
            for(c=0; c<m; c++) {
                bw.write(String.format("%d ", board[r][c]));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
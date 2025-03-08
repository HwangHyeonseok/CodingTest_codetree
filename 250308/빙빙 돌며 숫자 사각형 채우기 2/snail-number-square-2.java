import java.util.*;
import java.io.*;

public class Main {
    static int[] dr = {1,0,-1,0};
    static int[] dc = {0,1,0,-1};
    static int[][] board;
    static int dir = 0;
    static int curR = 0;
    static int curC = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new int[n][m];

        for(int i=1; i<=n*m; i++) {
            board[curR][curC] = i;
            // 다음 노드 이동 처리
            int nextR = curR + dr[dir];
            int nextC = curC + dc[dir];
            // 벽에 닿은 경우 방향 전환
            // 이미 방문한 적 있는 경우 방향 전환
            if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= m || board[nextR][nextC] != 0) { 
                dir = (dir + 1) % 4;
            }
            
            curR = curR + dr[dir];
            curC = curC + dc[dir];
        }

        // 출력
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
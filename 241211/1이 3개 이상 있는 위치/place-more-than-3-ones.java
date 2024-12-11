import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 101;
    static int[][] board = new int[MAX_N][MAX_N];
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // logic // 
        int ans = 0;

        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                // 상하좌우를 봤을 때 1의 개수를 센다.
                int oneCnt = 0; // 1의 개수
                for(int move=0; move<4; move++) {
                    int curR = dr[move] + r;
                    int curC = dc[move] + c;
                    if(curR < 0 || curC < 0 || curR >= n || curC >= n) continue;

                    if(board[curR][curC] == 1) oneCnt++;
                }
                // 1의 개수가 3개 이상이라면 정답 개수 추가
                if(oneCnt >= 3) ans++;
            }
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
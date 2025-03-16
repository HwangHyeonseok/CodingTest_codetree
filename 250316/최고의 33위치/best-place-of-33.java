import java.util.*;
import java.io.*;

public class Main {
    static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        
        for(int r=0; r<N; r++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int c=0; c<N; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        // logic //
        int ans = 0; // 3x3 범위 안에 최대로 들어간 코인 개수 = 정답
        for(int r=0; r<=N-3; r++) {
            for(int c=0; c<=N-3; c++) {
                ans = Math.max(checkCoinCnt(r, c), ans);
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 3x3 크기의 격자 안에 동전의 개수를 세는 함수
    public static int checkCoinCnt(int startR, int startC) {
        int coinCnt = 0;
        for(int r=startR; r<startR+3; r++) {
            for(int c=startC; c<startC+3; c++) {
                coinCnt += board[r][c];
            }
        }

        return coinCnt;
    }
}
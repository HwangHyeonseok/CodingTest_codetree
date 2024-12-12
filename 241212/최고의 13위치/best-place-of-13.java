import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 21;
    static int[][] board = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // logic // 
        int maxCoin = 0;
        for(int r=0; r<N; r++) {
            for(int c=0; c<N-2; c++) {
                // 하나의 격자에서 코인 개수 세기
                int coin = board[r][c] + board[r][c+1] + board[r][c+2];
                
                maxCoin = Math.max(coin, maxCoin);
            }
        }
        
        
        
        // output //
        bw.write(maxCoin+"");
        bw.flush();
        bw.close();
    }
}
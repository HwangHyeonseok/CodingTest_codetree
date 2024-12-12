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
                int coin = 0;
                // 하나의 격자에서 코인 개수 세기
                for(int i=c; i<c+3; i++) {
                    // 값이 1이 있을 때 동전 개수 + 1
                    if(board[r][i] == 1) coin++;
                }
                
                maxCoin = Math.max(coin, maxCoin);
            }
        }
        
        
        
        // output //
        bw.write(maxCoin+"");
        bw.flush();
        bw.close();
    }
}
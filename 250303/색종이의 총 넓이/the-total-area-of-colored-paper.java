import java.util.*;
import java.io.*;

public class Main {
    static int[][] board = new int[201][201];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            int x = Integer.parseInt(st.nextToken()) + 100;
            int y = Integer.parseInt(st.nextToken()) + 100;
                // (x,y)에서 (x+8, y+8) 까지를 1로 칠한다.
            for(int r=y; r<y+8; r++) {
                for(int c=x; c<x+8; c++) {
                    board[r][c] = 1;
                }
            }
        }

        // 1로 칠해진 갯수를 출력한다.
        int ans = 0;
        for(int r=0; r<board.length; r++) {
            for(int c=0; c<board[0].length; c++) {
                if(board[r][c] == 1) ans++;
            }
        }
        
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
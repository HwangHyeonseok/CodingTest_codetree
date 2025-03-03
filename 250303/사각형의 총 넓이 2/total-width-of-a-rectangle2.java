import java.util.*;
import java.io.*;

public class Main {
    static int[][] board = new int[101][101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int r=y1; r<y2; r++) {
                for(int c=x1; c<x2; c++) {
                    board[r][c] = 1;
                }
            }
        }
        
        
        // output //
        int ans = 0;
        for(int r=0; r<board.length; r++) {
            for(int c=0; c<board[0].length; c++) {
                if(board[r][c] == 1) ans++;
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 201;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[MAX_N][MAX_N];
        

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int r=y1+100; r<y2+100; r++) {
                for(int c=x1+100; c<x2+100; c++) {
                    board[r][c] = 1;
                }
            }
        }
        
        // output //
        int ans = 0;
        for(int r=0; r<MAX_N; r++) {
            for(int c=0; c<MAX_N; c++) {
                if(board[r][c] == 1) ans++;
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
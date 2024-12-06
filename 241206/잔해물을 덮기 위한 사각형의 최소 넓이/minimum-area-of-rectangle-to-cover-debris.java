import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 2001;
    static final int OFFSET = 1000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 직사각형 input 
        String inputA = br.readLine();
        StringTokenizer stA = new StringTokenizer(inputA, " ");
        int Ax1 = Integer.parseInt(stA.nextToken());
        int Ay1 = Integer.parseInt(stA.nextToken());
        int Ax2 = Integer.parseInt(stA.nextToken());
        int Ay2 = Integer.parseInt(stA.nextToken());

        // 두 번째 직사각형 input 
        String inputB = br.readLine();
        StringTokenizer stB = new StringTokenizer(inputB, " ");
        int Bx1 = Integer.parseInt(stB.nextToken());
        int By1 = Integer.parseInt(stB.nextToken());
        int Bx2 = Integer.parseInt(stB.nextToken());
        int By2 = Integer.parseInt(stB.nextToken());

        // logic // 
        int[][] board=  new int[MAX_N][MAX_N];
        // 첫 번째 직사각형 칠하기
        for(int r=Ay1; r<Ay2; r++) {
            for(int c=Ax1; c<Ax2; c++) {
                board[r+OFFSET][c+OFFSET] = 1;
            }
        }

        // 두 번째 직사각형으로 첫 번째 직사각형 없애기
        for(int r=By1; r<By2; r++) {
            for(int c=Bx1; c<Bx2; c++) {
                board[r+OFFSET][c+OFFSET] = 0;
            }
        }
        
        // 첫 번째 직사각형의 잔해 크기 구하기
        int maxR = -1;
        int minR = Integer.MAX_VALUE;
        int maxC = -1;
        int minC = Integer.MAX_VALUE;

        for(int r=Ay1; r<Ay2; r++) {
            for(int c=Ax1; c<Ax2; c++) {
                if(board[r+OFFSET][c+OFFSET] == 1) {
                    maxC = Math.max(maxC, c+OFFSET);
                    minC = Math.min(minC, c+OFFSET);
                }
            }
            maxR = Math.max(maxR, r+OFFSET);
            minR = Math.min(minR, r+OFFSET);
        }

        // output //
        int ans = (maxR-minR+1)*(maxC-minC+1);
        if(minR == Integer.MAX_VALUE || minC == Integer.MAX_VALUE) ans = 0; // 남은 첫 번째 직사각형의 잔해 영역이 없는 경우
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
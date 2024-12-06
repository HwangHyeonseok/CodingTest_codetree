import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 2001;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 직사각형 A input
        String inputA = br.readLine();
        StringTokenizer stA = new StringTokenizer(inputA, " ");
        int Ax1 = Integer.parseInt(stA.nextToken());
        int Ay1 = Integer.parseInt(stA.nextToken());
        int Ax2 = Integer.parseInt(stA.nextToken());
        int Ay2 = Integer.parseInt(stA.nextToken());

        // 직사각형 B input
        String inputB = br.readLine();
        StringTokenizer stB = new StringTokenizer(inputB, " ");
        int Bx1 = Integer.parseInt(stB.nextToken());
        int By1 = Integer.parseInt(stB.nextToken());
        int Bx2 = Integer.parseInt(stB.nextToken());
        int By2 = Integer.parseInt(stB.nextToken());

        // 직사각형 M input
        String inputM = br.readLine();
        StringTokenizer stM = new StringTokenizer(inputM, " ");
        int Mx1 = Integer.parseInt(stM.nextToken());
        int My1 = Integer.parseInt(stM.nextToken());
        int Mx2 = Integer.parseInt(stM.nextToken());
        int My2 = Integer.parseInt(stM.nextToken());

        // logic // 
        int[][] board = new int[MAX_N][MAX_N];
        // A 채우기
        for(int r=Ay1; r<Ay2; r++) {
            for(int c=Ax1; c<Ax2; c++) {
                board[r][c] = 1;
            }
        }

        // B 채우기
        for(int r=By1; r<By2; r++) {
            for(int c=Bx1; c<Bx2; c++) {
                board[r][c] = 1;
            }
        }

        // M 영역 지우기
        for(int r=My1; r<My2; r++) {
            for(int c=Mx1; c<Mx2; c++) {
                board[r][c] = 0;
            }
        }
        
        // output //
        int ans = 0;
        // A, B 영역에서 1인 부분 출력
        int startR = Math.min(Ay1, By1);
        int endR = Math.max(Ay2, By2);
        int startC = Math.min(Ax1, Bx1);
        int endC = Math.max(Ax2, Bx2);

        for(int r=startR; r<endR; r++) {
            for(int c=startC; c<endC; c++) {
                if(board[r][c] == 1) ans++;
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
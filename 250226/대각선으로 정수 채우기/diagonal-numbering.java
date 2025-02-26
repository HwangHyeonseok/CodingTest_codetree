// 로직 //
// 처음 시작 위치는 curR = 0, curC = 0 지정
// 1) 시작 위치 : (curR, curC)
// 2) 해당 위치에 숫자 적기

// while(curC == 0 || curR == n-1) {
    // 3) 대각선으로 이동하기 curC--; curR++;
    // 4) 해당 위치에 숫자 적기
// }

// 5) 시작 위치 변경 if(curC == m-1) r++; else c++; 


import java.util.*;
import java.io.*;

public class Main {
    static int[][] board = new int[101][101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // logic // 
        // 처음 시작 위치는 curR = 0, curC = 0 지정
        int curR = 0; int curC = 0;
        // saveR,C은 이동 한 사이클 여정 전 위치를 저장
        int saveR = 0; int saveC = 0;

        int draw = 1; // 칠할 숫자
        while(draw <= n*m) { // 다 칠할 때까지 반복
            // 1) 시작 위치 칠하기
            board[saveR][saveC] = draw++;
            while(curC != 0 && curR != n-1) {
                // 2) 대각선으로 이동하기 curC--; curR++;
                curC--; curR++;
                // 3) 해당 위치에 숫자 적기
                board[curR][curC] = draw;
                draw++;
            }

            // 4) 시작 위치 변경
            if(saveC == m-1) saveR++;
            else saveC++;

            // 5) 시작 위치 재조정
            curR = saveR;
            curC = saveC;
        }





        // output //
        // 6) 출력
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
import java.util.*;
import java.io.*;

public class Main {
    static char[][] command; // "/" :   "\": 
    static int[] dc = {0, 0, -1, 1};
    static int[] dr = {-1, 1, 0, 0};
    static int curR = 0; // 현재 R
    static int curC = 0; // 현재 C
    static int dir = 0; // 현재 움직이는 방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // input //
        int n = Integer.parseInt(br.readLine());
        command = new char[n][n];
        for(int r=0; r<n; r++) {
            String input = br.readLine();
            for(int c=0; c<n; c++) {
                command[r][c] = input.charAt(c);
            }
        }
        int k = Integer.parseInt(br.readLine());

        // 초기 위치 방향, 선정 //
        initLocation(n, k);

        // 레이저 이동 구현
        int moveCnt = 0;
        while(true) {
            if(curR < 0 || curC < 0 || curR >= n || curC >= n) break; // 맵 범위를 벗어나는 경우
            if(command[curR][curC] == '\\') {
                mirrorLeft();
            }
            else if(command[curR][curC] == '/') {
                mirrorRight();
            }

            moveCnt++;
        }
        bw.write(moveCnt+"");
        bw.flush();
        bw.close();
    }

    // 초기 위치, 방향 선정
    public static void initLocation(int n, int k) {
        // (k-1)/n 가 0일때는 1인덱스 
        if((k-1)/n == 0) {
            dir = 1;
            curR = 0;
            curC = k-1;
        }
        // (k-1)/n 가 1일때는 2인덱스 
        else if((k-1)/n == 1) {
            dir = 2;
            curR = k-n-1;
            curC = n-1;
        }
        // (k-1)/n 가 2일때는 0인덱스
        else if((k-1)/n == 2) {
            dir = 0;
            curR = n-1;
            curC = 3*n-k;
        }
        // (k-1)/n 가 3일때는 3인덱스
        else if((k-1)/n == 3) {
            dir = 3;
            curR = n*4-k;
            curC = 0;
        }
    }

    // "\" 일 경우 이동 및 이동 경로 변경(dir + 2)
    public static void mirrorLeft() {
        // 이동 경로 변경
        dir = (dir + 2)%4;
        // 이동
        curR = curR + dr[dir];
        curC = curC + dc[dir];
    }
    // "/" 일 경우 이동 및 이동 경로 변경(dir + 1 또는 dir - 1)
    public static void mirrorRight() {
        // 이동 경로 변경
        if(dir == 0 || dir == 2) dir = (dir - 1 + 4)% 4;
        else dir = (dir + 1)%4;
        // 이동
        curR = curR + dr[dir];
        curC = curC + dc[dir];
    }
}
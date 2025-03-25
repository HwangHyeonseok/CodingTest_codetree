import java.util.*;
import java.io.*;


public class Main {
    // 폭탄 위치 저장
    static class Point {
        int r;
        int c;
        
        Point(int r, int c) {
            this.r=r;
            this.c=c;
        }
    };
    static int N;
    static int[][] board;
    static ArrayList<Point> bombs = new ArrayList<>(); // 초기 폭탄 위치를 담는다.
    static int bombCnt; // 초기 폭탄 개수
    static int ans = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        board=  new int[N][N];

        for(int r=0; r<N; r++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int c=0; c<N; c++) {
                int command = Integer.parseInt(st.nextToken());
                if(command == 1) bombs.add(new Point(r,c));
                board[r][c] = command;
            }
        }

        bombCnt = bombs.size(); // 폭탄 개수
        
        backtracking(0); // 백트래킹(각 위치마다 1~3 폭탄 골라보기)
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 1번 폭탄
    static int[] dr1 = {-2,-1,0,1,2};
    static int[] dc1 = {0, 0, 0, 0, 0};  
    // 매개 변수는 중심점으로 받는다.
    // 폭탄을 터뜨리거나 bomb (+1), 복원하거나 bomb (-1)
    public static void firstBomb(int sr, int sc, int bomb) {
        for(int i=0; i<dr1.length; i++) {
            int nr = sr+dr1[i];
            int nc = sc+dc1[i];
            if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
            board[nr][nc] += bomb;
        }
    }
    // 2번 폭탄
    static int[] dr2 = {-1,1,0,0,0};
    static int[] dc2 = {0,0,-1,1,0};  
    // 매개 변수는 중심점으로 받는다.
    // 폭탄을 터뜨리거나 bomb (+1), 복원하거나 bomb (-1)
    public static void secondBomb(int sr, int sc, int bomb) { 
        for(int i=0; i<dr2.length; i++) {
            int nr = sr+dr2[i];
            int nc = sc+dc2[i];
            if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
            board[nr][nc] += bomb;
        }
    }
    // 3번 폭탄
    static int[] dr3 = {1,-1,-1,1,0};
    static int[] dc3 = {1,1,-1,-1,0};  
    // 매개 변수는 중심점으로 받는다.
    // 폭탄을 터뜨리거나 bomb (+1), 복원하거나 bomb (-1)
    public static void thirdBomb(int sr, int sc, int bomb) { 
        for(int i=0; i<dr3.length; i++) {
            int nr = sr+dr3[i];
            int nc = sc+dc3[i];
            if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
            board[nr][nc] += bomb;
        }
    }
    // 터진 영역 세는 함수
    public static int explodeCnt() {
        int cnt = 0;
        for(int r=0; r<N; r++) {
            for(int c=0; c<N; c++) {
                if(board[r][c] != 0) cnt++;
            }
        }
        return cnt;
    }

    // 백트래킹 (폭탄이 있는 각 위치를 저장해둔 것을 순서대로 1,2,3을 골라본다.)
    public static void backtracking(int cnt) {
        //basecase
        if(bombCnt == cnt) { // 다 고른 경우
            int res = explodeCnt();
            ans = Math.max(res, ans);
            return; 
        }
        
        Point cur = bombs.get(cnt);
        for(int i=0; i<3; i++) {
            // before recursive
            if(i==0) firstBomb(cur.r, cur.c,1);
            else if(i==1) secondBomb(cur.r, cur.c, 1);
            else if(i==2) thirdBomb(cur.r, cur.c, 1);

            // recursive
            backtracking(cnt+1);
            
            // after recursive
            if(i==0) firstBomb(cur.r, cur.c,-1);
            else if(i==1) secondBomb(cur.r, cur.c, -1);
            else if(i==2) thirdBomb(cur.r, cur.c, -1);
        }
    }
}
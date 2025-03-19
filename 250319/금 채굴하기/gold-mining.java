// 11분+ 1:57
// 손해보지 않으면서 채굴할 수 있는 가장 많은 금의 개수
// 채굴에 드는 비용 : Math.pow(K, 2) + Math.pow((K+1), 2)
// 금 한 개 가격 : M
// 손익 : (M*금 채굴 개수) - Math.pow(K, 2) + Math.pow((K+1), 2)

// 범위 초과 가능

import java.util.*;
import java.io.*;


public class Main {
    static int[][] coinBoard; // 금 지도
    static int[][] miningArea; // 채굴할 위치

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input //
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken()); // coinBoard n*n
        int M = Integer.parseInt(st.nextToken()); // 금 한 개의 가격

        coinBoard = new int[N][N];
        miningArea = new int[N][N];

        for(int r=0; r<N; r++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int c=0; c<N; c++) {
                coinBoard[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = getGold(N,M);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // (시작 위치와 N에 따른) 채굴 영역 설정 로직 - 백트래킹
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static void getArea(int curR, int curC, int K, int N) {
        // basecase
        if(K == 0) {
            return;
        }

        // recursive call
        for(int i=0; i<4; i++) {
            // 중복 제거 필요 없음
            // before recursive
            int nr = curR + dr[i];
            int nc = curC + dc[i];
            if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
            miningArea[nr][nc] = 1;
            
            // recursive
            getArea(nr, nc, K-1, N);

            // after recursive
        }
    }

    // 채굴 영역에서 금이 있는지 체크 + 이익을 보는지 체크
    public static int goldCheck(int K, int M, int N) {
        int goldCnt = 0; // 금이 발견된 갯수

        // 채굴한 금의 양 체크
        for(int r=0; r<N; r++) {
            for(int c=0; c<N; c++) {
                if(miningArea[r][c] == 1 && coinBoard[r][c] == 1) goldCnt++; // 채굴할 수 있는 영역이면서 금이 있는 영역
            }
        }

        // 손익 계산
        int cost = (int) Math.pow(K, 2) + (int) Math.pow((K+1), 2); // 채굴에 드는 비용 : Math.pow(K, 2) + Math.pow((K+1), 2)
        int earn = M*goldCnt;
        if(cost > earn) { // 손해인 경우
            return -1;
        }
        else { // 손해가 아닌 경우
            return goldCnt;
        }

    }

    // 채굴할 위치 초기화
    public static void initial(int N) {
        for(int r=0; r<N; r++) {
            for(int c=0; c<N; c++) {
                miningArea[r][c] = 0;
            }
        }
    }

    // 금 채굴 로직
    public static int getGold(int N, int M) {
        int ans = 0; // 손해보지 않으면서 채굴할 수 있는 가장 많은 금의 개수

        // (0,0)부터 K를 0~N-1까지 넓혀보면서 정답을 찾는다.
        for(int r=0; r<N; r++) { // 시작점 r
            for(int c=0; c<N; c++) { // 시작점 c
                for(int K=0; (int) Math.pow(K, 2)+(int) Math.pow((K+1),2)<=N*N; K++) { // 탐색 영역 K
                    if(K==0) { // (r,c) 지점만 탐색하는 경우
                        if(coinBoard[r][c] == 1) { // 그 지점에서 코인 발견
                            ans = Math.max(1, ans); // 코인 개수 1개
                        }
                        continue;
                    }
                    // 채굴 영역 설정
                    getArea(r, c, K, N);

                    // 채굴 영역에서 금이 있는지
                    ans = Math.max(ans, goldCheck(K,M,N));

                    // 채굴할 위치 초기화
                    initial(N);
                }
            }
        }

        return ans;
    }
}
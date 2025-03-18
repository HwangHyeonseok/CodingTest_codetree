import java.util.*;
import java.io.*;

public class Main {
    static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // input //
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); 
        board = new int[N][M];

        for(int r=0; r<N; r++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int c=0; c<M; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        // logic //
        // 시작점을 대고 최댓값인지 판단한다.
        int ans = -1;
        for(int r=0; r<N; r++) {
            for(int c=0; c<N; c++) {
                int maxTriangleSum = triangle(r,c, N, M);
                int maxlongSquareSUm = square(r,c,N,M);
                
                ans = Math.max(maxTriangleSum, ans);
                ans = Math.max(maxlongSquareSUm, ans);
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // r,c 위치를 기준으로 삼각형 형태의 막대를 가져다 대고 합해서 나올 수 있는 최대의 수를 구한다. 
    // 삼각형의 중간을 기준으로 했음
    static int[][] dr = {{0,0,1}, {0,0,1}, {0,0,-1}, {0,0,-1}};
    static int[][] dc = {{0,1,0}, {0,-1,0}, {0,1,0}, {0,-1,0}};

    public static int triangle(int r, int c, int N, int M) {
        int maxSum = 0; // 해당 위치에서 블럭을 댔을 때 나올 수 있는 최대 합
        for(int i=0; i<4; i++) { // 블럭의 모양을 바꿔가면서 대본다.
            int tempSum = 0; // 블럭을 댔을 때의 합계
            for(int j=0; j<3; j++) {
                // 돌면서 다음 노드 탐색
                int nextR = r+dr[i][j];
                int nextC = c+dc[i][j];

                if(nextR < 0 || nextC < 0 || nextR >= N || nextC >= M) { // 범위 밖
                    tempSum = -1;
                    break; 
                }
                tempSum += board[nextR][nextC];
            }
            // System.out.println("r : " + r + " c : " + c + " tempSum : " + tempSum);
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }

    // r,c 위치를 기준으로 긴 사각형 형태의 막대를 가져다 대고 합해서 나올 수 있는 최대의 수를 구한다. 
    // 맨 끝부분을 기준으로 했음
    static int[][] dr1 = {{0,1,2}, {0,0,0}};
    static int[][] dc1 = {{0,0,0}, {0,1,2}};

    public static int square(int r, int c, int N, int M) {
        int maxSum = 0; // 해당 위치에서 블럭을 댔을 때 나올 수 있는 최대 합
        for(int i=0; i<2; i++) { // 블럭의 모양을 바꿔가면서 대본다.
            int tempSum = 0; // 블럭을 댔을 때의 합계
            for(int j=0; j<3; j++) {
                // 돌면서 다음 노드 탐색
                int nextR = r+dr1[i][j];
                int nextC = c+dc1[i][j];

                if(nextR < 0 || nextC < 0 || nextR >= N || nextC >= M) { // 범위 밖
                    tempSum = -1;
                    break; 
                }
                tempSum += board[nextR][nextC];
            }
            // System.out.println("r : " + r + " c : " + c + " tempSum : " + tempSum);
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }
}
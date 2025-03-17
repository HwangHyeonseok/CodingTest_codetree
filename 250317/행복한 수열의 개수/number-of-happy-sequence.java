import java.util.*;
import java.io.*;
  
public class Main {
    static int[][] board;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        N = Integer.parseInt(st.nextToken()); 
        M = Integer.parseInt(st.nextToken()); // 연속해야 하는 숫자의 수

        board = new int[N][N]; // 격자 크기 N*N

        // 격자 정보 input
        for(int r=0; r<N; r++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int c=0; c<N; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        // 행복한 수열의 개수를 센다.
        int ans = 0;
        for(int i=0; i<N; i++) {
            ans = ans + isHappyArr(i);
        }
        
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 행복한 수열인지 체크하는 로직
    public static int isHappyArr(int checkIdx) {
        int happyArrCnt = 0; // 행복한 수열 개수 (return 값)
        int combo = 0; // 연속된 숫자 개수
        int prevNum = -1; // 직전에 담긴 숫자 

        // r : checkIdx  c : 0~N-1  한 행 체크
        for(int c=0; c<N; c++) {
            if(prevNum == -1) { // 처음 비교군이 없는 경우
                combo++;
                prevNum = board[checkIdx][c];
            }
            
            else if(prevNum == board[checkIdx][c]) { // 이전 숫자와 같은 경우
                combo++;
            }

            else {  // 이전 숫자와 다른 경우 
                prevNum = board[checkIdx][c]; // 새로운 숫자로 갱신 후 콤보를 1로
                combo = 1;
            }
            
            if(combo == M) { // 목표하던 콤보수 M을 달성한 경우
                happyArrCnt++;
                // System.out.println("checkIdx : " + checkIdx + " c : " + c  +"나 지금 행복해");
                break;
            }
        }

        // r : 0~N-1, c : checkIdx 한 열 체크
        for(int r=0; r<N; r++) {
            if(prevNum == -1) { // 처음 비교군이 없는 경우
                combo++;
                prevNum = board[r][checkIdx];
            }
            
            else if(prevNum == board[r][checkIdx]) { // 이전 숫자와 같은 경우
                combo++;
            }

            else {  // 이전 숫자와 다른 경우 
                prevNum = board[r][checkIdx]; // 새로운 숫자로 갱신 후 콤보를 1로
                combo = 1;
            }
            
            if(combo == M) { // 목표하던 콤보수 M을 달성한 경우
                happyArrCnt++;
                // System.out.println("checkIdx : " + checkIdx + " r : " + r  +"나 지금 행복해");
                break;
            }
        }

        return happyArrCnt;
    }
}
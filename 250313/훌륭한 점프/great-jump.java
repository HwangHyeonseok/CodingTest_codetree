import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        board = new int[N];

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        int boardMaxVal = 0;
        for(int i=0; i<N; i++) {
            board[i] = Integer.parseInt(st.nextToken());
            boardMaxVal = Math.max(boardMaxVal, board[i]);
        }

        // logic //
        int ans = boardMaxVal; // 처음에는 board에 담긴 수 중 최댓값

        // 답을 boardMaxVal ~ 1 까지 가정해보면서 그 최솟값을 정답으로 한다.
        for(int i=boardMaxVal; i>=Math.max(board[0], board[N-1]); i--) {
            // 건너면서 최대로 건너뛰어야 하는 거리 계산
            int distanceTemp = 0;
            int distanceMax = 0;
            for(int j=0; j<N; j++) {
                if(board[j] > i) {
                    distanceTemp++;
                }
                else {
                    distanceMax = Math.max(distanceMax, distanceTemp);
                    distanceTemp = 0;
                }
            }
            // 만약 N번째 지점에 도달할 수 없는 경우
            if(distanceTemp != 0) continue;

            // 만약 k번보다 더 점프량이 적은 경우 최솟값 갱신
            if(distanceMax < K) {
                ans = i;
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
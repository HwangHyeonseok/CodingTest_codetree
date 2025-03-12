import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        board = new int[N];

        for(int i=0; i<N; i++) {
            board[i] = Integer.parseInt(br.readLine());
        }

        // logic //
        // 정렬해서 순회하며 최대로 고를 수 있는 원소 수 구하기
        Arrays.sort(board);
        
        // 최대로 고를 수 있는 원소 수 체크
        int ans = -1;
        for(int i=0; i<N; i++) { // i : 선택을 시작할 원소 인덱스
            int minVal = board[i];
            int j = i;
            int chooseCnt = 0;

            while(j < N && board[j] <= minVal+K) { // 순회하며 최대 취소 원소간의 차이가 k를 넘지 않는 최대로 고를 수 있는 원소 수 세기
                chooseCnt++;
                j++;
            }

            // 최대로 고를 수 있는 원소 수 최신화
            ans = Math.max(ans, chooseCnt);
        }


        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
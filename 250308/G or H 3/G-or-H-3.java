import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[10001]; // 위치 별 알파벳 정보
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        for(int i=0; i<n; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int idx = Integer.parseInt(st.nextToken());
            char command = st.nextToken().charAt(0);

            if(command == 'G') board[idx] = 1;
            else if(command == 'H') board[idx] = 2;
        }
        // test //
        // for(int i=0; i<board.length; i++) {
        //     System.out.print(board[i] + " ");
        // }

        // logic // 
        // K 개를 연속으로 선택해서 나올 수 있는 최대 점수
        int ans = 0;
        for(int choose=0; choose < board.length-k; choose++) {
            // choose 번째 인덱스부터 choose+K 번째 인덱스까지 점수를 합한다.
            int tempAns = 0;
            for(int j=choose; j<=choose+k; j++) {
                tempAns += board[j];
            }
            // 만약 현재 최댓값보다 크면 정답으로 갱신해준다.
            ans = ans > tempAns ? ans : tempAns;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
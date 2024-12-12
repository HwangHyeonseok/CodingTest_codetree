// 전략 : 1,2,3,4,5번 집이 있다면 각 집에 대해서 모두가 갔을 때 거리가 얼마나 되는지 비교
import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 101;
    static int[] board = new int[MAX_N];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=0; i<n; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        // logic // 
        int minDistance = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            int distance = 0;
            for(int j=0; j<n; j++) { // i 와 j 의 차이가 이동 해야 하는 거리이다.
                if(i==j) continue; // 같은 집에서 같은 집으로 이동하는 거리는 0
                // 이동 거리 계산
                distance += (Math.max(j,i) - Math.min(j,i)) * board[j];
            } 
            // test
            // System.out.println(i + "번의 이동 거리 : " + distance);
            minDistance = Math.min(distance, minDistance);
        }
        
        // output //
        bw.write(minDistance+"");
        bw.flush();
        bw.close();
    }
}
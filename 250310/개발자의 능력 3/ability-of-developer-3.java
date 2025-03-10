import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[6];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int boardTemp = 0; // board 배열 합계
        for(int i=0; i<6; i++) {
            int num = Integer.parseInt(st.nextToken());
            board[i] = num;
            boardTemp += num;
        }

        // logic // 
        int ans = Integer.MAX_VALUE;
       
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                for(int k=0; k<6; k++) {
                    int sumTemp = 0;
                    if(i != j && j != k && k != i) { // 고른 3개가 다 달라야 한다.
                        sumTemp += (board[i] + board[j] + board[k]); // 고른 3개의 합
                        // (전체합 -고른 3개 합) 과 고른 3개 합의 차이가 최소가 되는 것을 고른다.
                        if(ans > Math.abs((boardTemp-sumTemp) - sumTemp)) {
                            ans = Math.abs((boardTemp-sumTemp) - sumTemp);
                        }
                    }
                }
            }
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
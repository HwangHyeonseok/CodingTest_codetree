import java.util.*;
import java.io.*;

public class Main {
    static int[] board;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int n = Integer.parseInt(br.readLine());
        board = new int[n];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=0; i<n; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        // // test //
        // for(int i=0; i<n; i++) {
        //     System.out.println(board[i]);
        // }

        // logic // 
        // 1개 ~ n개 까지 범위를 지정해서 고른다.
        int ans = 0;
        for(int chooseCnt = 1; chooseCnt <= n; chooseCnt++) { // 고르는 갯수
            for(int startIdx = 0; startIdx <= n-chooseCnt; startIdx++) { // 시작 위치
                int tempNum = 0;
                boolean isAnswer = false;
                for(int i = startIdx; i<startIdx+chooseCnt; i++) { // startIdx~chooseCnt까지 순회
                    tempNum += board[i];
                }
                
                // 평균 값이 원소에 있는지 체크
                for(int i=startIdx; i<startIdx+chooseCnt; i++) {
                    if(tempNum == board[i]*chooseCnt) {
                        isAnswer = true;
                    }
                }

                // 평균 값이 원소에 있는 경우 정답 +1
                if(isAnswer == true) ans++;
            }
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
// 1,2,3 조약돌이 있다고 가정하고 완전 탐색

import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[4];
    static int[] a;
    static int[] b;
    static int[] c;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N= Integer.parseInt(br.readLine());
        a = new int[N];
        b = new int[N];
        c = new int[N];

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }

        // logic //
        int MaxCorrectCnt = 0; // 최대로 맞춘 횟수
        int ans = 0; // 종이컵 ans 번에 넣어야 최대로 조약돌을 발견할 수 있다.
        for(int init=1; init<=3; init++) { // 야바위에 처음 넣는 곳
            // 공 넣기
            for(int j=0; j<=3; j++) {
                if(j == init) board[j] = 1;
                else board[j] = 0;
            }

            // 야바위 로직 실행
            int curCorrectCnt = yabawi();
            
            // 만약 지금 맞춘 횟수가 최고인 경우 갱신하고 그 값을 저장
            if(curCorrectCnt > MaxCorrectCnt) {
                MaxCorrectCnt = curCorrectCnt;
                ans = init;
            }

            // test //
            // System.out.println("init : " + init + " curCorrectCnt : " + curCorrectCnt);
        }
        
        bw.write(MaxCorrectCnt+"");
        bw.flush();
        bw.close();
    }
    // 야바위 로직
    public static int yabawi() {
        int correctCnt = 0; // 야바위 맞춘 횟수
        for(int i=0; i<N; i++) { // 3개의 명령어 실행
            // a 와 b 를 바꾼다.
            int temp = board[a[i]];
            board[a[i]] = board[b[i]];
            board[b[i]] = temp;    
            // c를 선택한다.
            if(board[c[i]] == 1) correctCnt++;
        }
     

        return correctCnt;
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 2000001;
    static final int OFFSET = 1000000;
    static int[] boardA = new int[MAX_N];
    static int[] boardB = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // logic // 
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken()); // A의 이동
        int M = Integer.parseInt(st.nextToken()); // B의 이동
        
        // A 이동 입력 + 구현
        int moveCntA = 0; // A의 누적 이동 시간
        int curA = 0; // A의 위치
        for(int i=0; i<N; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            String command = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());

            if(command.equals("R")) {
                for(int c=0; c<moveCnt; c++) {
                    curA++;
                    moveCntA++;
                    boardA[curA+OFFSET] = moveCntA;
                }
            }

            else if(command.equals("L")) {
                for(int c=0; c<moveCnt; c++) {
                    curA--;
                    moveCntA++;
                    boardA[curA+OFFSET] = moveCntA;
                }
            }
        }

        // // A 이동 출력
        // for(int i=OFFSET-20; i<OFFSET+20; i++) {
        //     System.out.print(boardA[i] + " ");
        // }

        // B 이동 입력 + 구현
        int curB = 0; // 현재 B의 위치
        int moveCntB = 0; // B의 누적 이동 시간
        for(int i=0; i<M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            String command = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());

            if(command.equals("R")) {
                for(int c=0; c<moveCnt; c++) {
                    curB++;
                    moveCntB++;
                    boardB[curB+OFFSET] = moveCntB;
                }
            }

            else if(command.equals("L")) {
                for(int c=0; c<moveCnt; c++) {
                    curB--;
                    moveCntB++;
                    boardB[curB+OFFSET] = moveCntB;
                }
            }
        }


        // output //
        // 만나는 순간 = 인덱스에 기록한 이동 횟수가 같은 순간 중 가장 짧은 시간이 걸리는 것을 출력
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<boardA.length; i++) {
            if(boardA[i] != 0 && boardA[i] == boardB[i]) {
                ans = Math.min(ans, boardA[i]);
            }
        }
        
        if(ans == Integer.MAX_VALUE) { // 만날 수 없는 경우
            ans = -1;
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
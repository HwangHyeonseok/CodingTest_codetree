// B -> B | W -> W 로 가는 경우는 없다.
// B로 바뀌는 배열, W로 바뀌는 배열 따로 카운트해서 둘 다 2 이상이면 gray로 칠한다.

import java.util.*;
import java.io.*;

public class Main {
    static int[] blackCnt = new int[200000]; // 검정색 칠한 횟수
    static int[] whiteCnt = new int[200000]; // 흰색 칠한 횟수
    static int[] board = new int[200000]; // 색 -> 무색 : 0, B : 1, W : 2 Gray : 3
    static int curLoc = 100000; // 현재 위치
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            int moveCnt = Integer.parseInt(st.nextToken());
            char command = st.nextToken().charAt(0);

            if(command == 'R') moveR(moveCnt);
            else if(command == 'L') moveL(moveCnt);
        }

        // output //
        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;
        for(int i=0; i<board.length; i++) {
            if(board[i] == 2) whiteCnt++; // 흰색인 경우
            else if(board[i] == 1) blackCnt++; // 검은색인 경우
            else if(board[i] == 3) grayCnt++; // 회색인 경우
        }
        bw.write(String.format("%d %d %d", whiteCnt, blackCnt, grayCnt));
        bw.flush();
        bw.close();
    }
    
    // 오른쪽으로 움직이기 로직
    public static void moveR(int moveCnt) {
        // System.out.println("moveR 호출");
        for(int i=0; i<moveCnt; i++) {
            if(board[curLoc] != 3) { // 회색인 경우 변화 X  
                board[curLoc] = 1; // 검정으로 먼저 칠한다. 
                blackCnt[curLoc]++; // 검정색 칠한 카운트 +1

                if(whiteCnt[curLoc] >= 2 && blackCnt[curLoc] >= 2) { // 흰색 2번, 검은색 2번 칠한 경우
                    board[curLoc] = 3;
                }
            }


            if(i == moveCnt-1) {
                // System.out.println(curLoc+"\n");
                break; // 마지막에는 움직이지 않는다.
            }
            curLoc++;
        }
    }

    // 왼쪽 움직이기 로직
    public static void moveL(int moveCnt) {
        // System.out.println("moveL 호출");
        for(int i=0; i<moveCnt; i++) {
            if(board[curLoc] != 3) { // 회색인 경우 변화 X 
                board[curLoc] = 2; // 흰색으로 먼저 칠한다. 
                whiteCnt[curLoc]++; // 흰색 칠한 카운트 +1

                if(whiteCnt[curLoc] >= 2 && blackCnt[curLoc] >= 2) { // 흰색 2번, 검은색 2번 칠한 경우
                    board[curLoc] = 3;
                }
            } 

            if(i == moveCnt-1) {
                // System.out.println(curLoc+"\n");
                break; // 마지막에는 움직이지 않는다.
            }
            curLoc--;
        }
    }

}
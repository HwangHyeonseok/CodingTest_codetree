import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 0~100000 [0]~[100000]
        // -1~-100000 [100001]~[200000]
        int[] board = new int[200001]; // White : 1, Black : 2
        int[] change = new int[200001]; // 변경 횟수 : 4회 이상이면 gray
        int curX = 0; // 현재 위치

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int moveCnt = Integer.parseInt(st.nextToken());
            String moveDir = st.nextToken();

            if(moveDir.equals("R")) { // 검은색으로 칠하기
                for(int c=curX+100000; c<curX+moveCnt+100000; c++) {
                    if(board[c] != 2) {
                        change[c]++;
                        board[c] = 2;
                    }
                }

                curX += moveCnt-1;
            }

            else if(moveDir.equals("L")) { // 흰색으로 칠하기
                for(int c=curX+100000; c>curX-moveCnt+100000; c--) {
                    if(board[c] != 1) {
                        change[c]++;
                        board[c] = 1;
                    }
                }

                curX -= moveCnt-1;
            }
        }
        
        // output //
        int white = 0; // 1
        int black = 0; // 2
        int gray = 0; // change[i]가 4 이상
        for(int i=0; i<board.length; i++) {
            if(change[i] >= 4) {
                gray++;
                continue;
            }

            else if(board[i] == 1) white++;
            else if(board[i] == 2) black++;
        }

        bw.write(String.format("%d %d %d", white, black, gray));
        bw.flush();
        bw.close();
    }
}
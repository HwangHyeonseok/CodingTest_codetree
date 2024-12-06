import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 0~1000 양수, 1001~2000 음수
        int[] board = new int[2001];
        int curX = 0;

        int n = Integer.parseInt(br.readLine());

        // logic //
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int moveCnt = Integer.parseInt(st.nextToken());
            String moveDir = st.nextToken();

            if(moveDir.equals("R")) {
                for(int c=curX+1000; c<curX+moveCnt+1000; c++) {
                    board[c]++;
                }
                curX += moveCnt;
            }

            else if(moveDir.equals("L")) {
                for(int c=curX+1000-1; c>=curX-moveCnt+1000; c--) {
                    board[c]++;
                }
                curX -= moveCnt;
            }
        }

        // output //
        int ans = 0;
        for(int i=0; i<=2000; i++) {
            if(board[i] >= 2) ans++;
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
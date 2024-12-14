import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 15;
    static String board[][] = new String[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int R = Integer.parseInt(st.nextToken()); // 세로
        int C = Integer.parseInt(st.nextToken()); // 가로
        
        for(int i=0; i<R; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int j=0; j<C; j++) {
                board[i][j] = st.nextToken();
            }
        };

        // logic // 
        int ans = 0;
        int temp = 0;

        boolean isWhite = true;
        if(board[0][0].equals("W")) isWhite = true;
        else isWhite = false;

        // 예외 처리
        if(board[0][0].equals(board[R-1][C-1])) {
            System.out.println(0);
            return;
        }

        // 첫 번째 이동 지역 찾기
        for(int r=1; r<R-2; r++) {
            for(int c=1; c<C-2; c++) {
                // 첫 번째 이동 지역을 찾았다면 그 다음 이동 경로를 찾는다.
                if((isWhite == true && board[r][c].equals("B")) || (isWhite == false && board[r][c].equals("W"))) {
                    // temp++;
                    for(int i=r+1; i<R-1; i++) {
                        for(int j=c+1; j<C-1; j++) {
                            // 두 번째 이동 경로들의 경우의 수를 모두 합한다.
                            if(isWhite == true && board[i][j].equals("W") || isWhite == false && board[i][j].equals("B")) {
                                ans++;
                                // System.out.println("i =" + i + "j = " + j);
                            } 
                        }
                    }
                }
            }
        }
        
        // output //
        // bw.write(temp+"\n");
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}
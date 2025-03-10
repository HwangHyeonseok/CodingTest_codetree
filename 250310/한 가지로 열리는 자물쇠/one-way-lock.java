import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<board.length; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }
        
        // (i,j,k) 를 골라서 이 것들이 열리는 자물쇠인지 체크
        int ans = 0; // 열리는 자물쇠 개수
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=n; k++) {
                    int[] combination = {i,j,k};
                    ans += isOpen(combination);
                }
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 열리는 자물쇠인지 체크
    public static int isOpen(int[] combination) {
        for(int a=0; a<board.length; a++) {
            if(Math.abs(board[a]-combination[a]) <= 2) { // 2 이내라면 열린다.
                return 1;
            }
        }
        return 0; // 열리는 것이 없는 경우
    }
}
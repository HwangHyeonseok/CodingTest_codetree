import java.util.*;
import java.io.*;

public class Main {
    static Integer[] board; 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        board = new Integer[n*2];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n*2; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        // logic // 
        // 정렬 후 (제일 높은 숫자 + 제일 낮은 숫자) 의 조합을 만들어서 최댓값을 출력한다.
        Arrays.sort(board, Collections.reverseOrder());
        
        int ans = -1;
        for(int i=0; i<n; i++) {
            // System.out.println("i = " + i + " board[i] + board[board.length-1-i] = " + (board[i] + board[board.length-1-i]));
            if(ans < (board[i] + board[board.length-1-i])) {
                ans = board[i] + board[board.length-1-i];
            }
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static Integer[] board = new Integer[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        for(int i=0; i<10; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 함수 이용
        Arrays.sort(board, Collections.reverseOrder());
        bw.write(board[0]+"");
        bw.flush();
        bw.close();
    }
}
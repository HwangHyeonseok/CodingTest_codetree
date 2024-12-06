import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 200;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Integer[] board = new Integer[MAX_N];
        Arrays.fill(board, 0); // 0으로 초기화
        
        // for(int i=0; i<board.length; i++) {
        //     System.out.println(board[i]);
        // }
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            
            for(int c=x1+100; c<x2+100; c++) {
                board[c]++;
            }
        }

        
        // 배열 정렬 후 최댓값 출력
        Arrays.sort(board, Collections.reverseOrder());

        bw.write(board[0]+"");
        bw.flush();
        bw.close();
    }
}
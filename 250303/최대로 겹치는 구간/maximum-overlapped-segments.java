import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[201];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());
            
            for(int j=startNum; j<endNum; j++) {
                board[j+100]++;
            }
        }

        // 몇 개가 누적되어 있는지 체크
        int ans = 0;
        for(int i=0; i<board.length; i++) {
            if(ans < board[i]) ans = board[i];
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
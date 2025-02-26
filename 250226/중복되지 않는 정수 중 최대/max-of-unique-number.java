import java.util.*;
import java.io.*;

public class Main {
    static int[] board = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            board[Integer.parseInt(st.nextToken())]++;
        }

        // logic //
        int ans = -1;
        for(int i=1000; i>=1; i--) {
            if(board[i] == 1) {
                ans = i;
                break;
            }
        }
        

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
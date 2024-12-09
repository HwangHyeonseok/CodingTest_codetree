import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] board = new int[N]; // 양수 1, 음수 2

        for(int i=0; i<N; i++) {
            if(Integer.parseInt(br.readLine()) > 0) board[i] = 1;
            else board[i] = 2;
        }

        // logic // 
        int cnt = 0;
        int ans = 0;
        
        for(int i=0; i<N; i++) {
            if(i == 0 || board[i] == board[i-1]) {
                cnt++;
            }
            else {
                ans = Math.max(cnt, ans);
                cnt = 1;
            }
        }
        ans = Math.max(cnt, ans); // 마무리

        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
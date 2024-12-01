import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int ans = toOneNumCnt(N, 0);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int toOneNumCnt(int N, int cnt) throws IOException {
        // basecase
        if(N == 1) return cnt;
        
        // logic
        if(N%2 == 0) return toOneNumCnt(N/2, cnt+1);
        else return toOneNumCnt(N/3, cnt+1);
    }

}
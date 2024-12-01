import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int ans = logic(N, 0);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int logic(int n, int cnt) throws IOException {
        if(n == 1) return cnt;
        
        if(n%2==0) return logic(n/2, cnt+1);
        else return logic(n*3+1, cnt+1);
    }
}
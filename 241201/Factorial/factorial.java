import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int ans = fact(N);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int fact(int N) throws IOException {
        if(N == 0 || N == 1) return 1;
        
        return fact(N-1) * N;
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int ans = fibo(N);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int fibo(int n) throws IOException{
        if(n == 1 || n == 2) return 1;
        
        return fibo(n-1) + fibo(n-2);
    }
}
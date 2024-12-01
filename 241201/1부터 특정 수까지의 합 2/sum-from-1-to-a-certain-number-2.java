import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int ans = sumNum(n, 0);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int sumNum(int n, int sum) throws IOException {
        if(n == 0) return sum;
        return sumNum(n-1, sum+n);
        
    }
}
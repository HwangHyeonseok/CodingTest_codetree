import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        int ans = multiple(input, 0);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int multiple(int n, int ans) throws IOException {
        if(n < 10) return n*n + ans;
        return multiple( n/10, ans + (n%10)*(n%10) );
    }
}
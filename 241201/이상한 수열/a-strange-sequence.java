import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int ans = logic(N);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int logic(int N) throws IOException {
        if(N == 1) return 1;
        if(N == 2) return 2;

        return logic(N/3) + logic(N-1); 
    }
}
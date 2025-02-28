import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = chaedae(n,m);

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 최대공약수를 구하는 함수
    public static int chaedae(int n, int m) {
        int ans = 1;
        for(int i=2; i<=Math.min(n,m); i++) {
            if(n%i == 0 && m%i == 0) {
                ans = i;
            }
        }

        return ans;
    }
    
}
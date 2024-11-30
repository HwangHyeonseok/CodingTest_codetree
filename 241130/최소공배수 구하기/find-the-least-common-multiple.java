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
        
        bw.write(mincommonmultiple(n,m)+"");
        bw.flush();
        bw.close();
    }

    // logic //
    public static int mincommonmultiple(int n, int m) {
        int maxCommonDivisor = 0; // 최대공약수 값

        // 1) 최대공약수 값 구하기
        for(int i=1; i<=Math.min(n,m); i++) {
            if(n%i ==0 && m%i ==0) {
                maxCommonDivisor = i;
            }
        }

        // 2) 최대공약수 * (n/최대공약수) * (m/최대공약수) 값 구하기
        int ans = maxCommonDivisor * (n / maxCommonDivisor) * (m / maxCommonDivisor);
        return ans;
    }
}
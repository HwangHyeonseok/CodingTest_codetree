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

        bw.write(maxCommonDivision(n,m)+"");
        bw.flush();
        bw.close();
        
    }

    // logic // 
    // 12 18으로 예를 들면,
    // 1~이 둘 중 최솟값 에 해당하는 수를 나눴을 때 나머지가 둘 다 0이면 공약수이다.
    // 그 중 최대가 되는 값을 구하면 된다.
    public static int maxCommonDivision(int n, int m) {
        int ans = 0;
        for(int i=1; i<=Math.min(n,m); i++) {
            if(n % i == 0 && m % i == 0) {
                ans = i;
            }
        }

        return ans;
    }
}
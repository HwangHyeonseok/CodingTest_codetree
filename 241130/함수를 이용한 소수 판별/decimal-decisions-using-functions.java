import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int i=a; i<=b; i++) {
            if(isPrime(i) == true) ans += i;
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 소수 판별 logic //
    // 7이 소수인지 아닌지 판별하려면, 2~(7/2) 값까지 모두 나눴을 때 나머지가 0이 아니면 된다.
    // 5 % 2 != 0
    // 5 % 3 != 0 
    // -> 따라서 7은 소수이다.
    static boolean isPrime(int checkNum) {
        if(checkNum == 1) return false; // 1은 소수가 될 수 없다.
        for(int i=2; i<=(checkNum/2); i++) {
            if(checkNum % i == 0) return false;
        }

        return true;
    }
}
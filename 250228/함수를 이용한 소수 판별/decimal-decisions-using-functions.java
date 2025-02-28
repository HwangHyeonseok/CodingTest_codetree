// 소수인지 판단

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        // logic // 
        int ans = 0;
        for(int i=a; i<=b; i++) {
            if(isPrime(i) == true) ans += i;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int checkNum) {
        for(int i=2; i<=checkNum/2; i++) {
            if(checkNum % i == 0) return false;
        }
        return true;
    }
}
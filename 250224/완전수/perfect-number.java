// 6의 진약수란 6을 나누어 떨어지게 하는 양의 정수 중 6이 아닌 수
// 28의 진약수 -> 1,2,4,7,14
// 어떤 수의 진약수가 되려면 ...

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken()); 

        int ans = 0;
        for(int i=start; i<=end; i++) {
            if(isWanjensu(i) == true) ans++;
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 완전수인지 체크하는 알고리즘
    public static boolean isWanjensu(int checkNum) {
        int jinYuksu = 0; // 진약수의 총합
        for(int i=1; i<=checkNum/2; i++) {
            if(checkNum%i == 0) jinYuksu += i;
        }

        if(jinYuksu == checkNum) return true;
        else return false;
    }
}
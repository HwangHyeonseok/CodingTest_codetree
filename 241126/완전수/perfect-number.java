// 약수를 구하는 알고리즘
// 어떤 수 n의 모든 약수를 구하려면 1~n까지 돌아보면서 0으로 나누어 떨어지는지 확인한다.
// Ex) 28의 모든 약수 찾기
// 28 % 1 == 0 --> 1은 28의 약수이다.
// 28 % 2 == 0 --> 2은 28의 약수이다.
// 28 % 3 != 0 --> 3은 28의 약수가 아니다.

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
        
        // logic //
        int ans = 0;

        for(int i=start; i<=end; i++) {
            if(wanjuensu(i) == true) {
                ans++;
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 완전수 체크 알고리즘 (완전수면 true 반환)
    static public boolean wanjuensu(int checkNum) {
        int yaksuSum = 0; // 모든 약수의 합
        
        // 약수 모두 찾아서 더하기
        for(int i=1; i<checkNum; i++) {
            if(checkNum % i == 0) {
                yaksuSum += i;
            }
        }

        // 모든 약수의 합 == 확인하고자 하는 숫자이면 완전수
        if(yaksuSum == checkNum) return true;
        else return false;
    }
}
// 소수가 될 조건
// 소수 : 1과 자기 자신으로 나누어지지 않는 수

// Ex) 3는 소수일까? (2~(3/2)만 따져보면 됨) 조건 검사가 필요 없으므로 소수
// Ex) 5는 소수일까? (2~(5/2)만 따져보면 됨) 5%2 != 0 이므로 소수
// Ex) 9은 소수일까? (2~(9/2)만 따져보면 됨) 9%2 != 0 (통과), 9%3 ==0 이므로 소수가 아니다.

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=2; i<=n; i++) {
            if(isPrime(i) == true) {
                bw.write(i + " ");
            }
        }
        bw.flush();
        bw.close();
    }

    // 소수 판별 알고리즘
    // 1) 2 ~ checkNum/2 의 수까지 나눴을 때 나머지가 하나라도 0인 것이 있으면 소수가 아니다. 
    public static boolean isPrime(int checkNum) {
        for(int i=2; i<=checkNum/2; i++) {
            if(checkNum%i == 0) return false;
        }

        return true;
    }
}
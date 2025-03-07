
// 바꿀 것이 없는 경우 
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] inputArr = input.toCharArray();

        boolean isChange = false; // 바뀐 적이 있는지 검사
        for(int i=0; i<inputArr.length; i++) {
            // 바꿀 것이 있는 경우 = 0이 있는 경우 -> 가장 큰 숫자 범위를 1로 바꾼다.
            if(inputArr[i] == '0') {
                inputArr[i] = '1';
                isChange = true;
                break;
            }
        }

        // 2진수의 숫자를 10진수로 변환
        int weight = 1; // 가중치
        int ans = 0;
        for(int i=inputArr.length-1; i>=0; i--) {
            ans += weight*(int)(inputArr[i]-'0');
            weight *= 2;
        }

        // 전부 다 돌았는데도 바꿀 것이 없었던 경우 = 모두 1인 경우 -> 가장 최소 단위 범위의 숫자를 0으로 바꾼다. = 최종 정답에 -1
        if(isChange == false) {
            ans -= 1;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
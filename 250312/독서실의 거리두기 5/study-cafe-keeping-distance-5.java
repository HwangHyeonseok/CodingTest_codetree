import java.util.*;
import java.io.*;

public class Main {
    static char[] inputArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        inputArr = input.toCharArray();
        
        int ans = -1;
        for(int pickIdx = 0; pickIdx < N; pickIdx++) { // 자리 선택
            // 이미 선택된 자리인 경우
            if(inputArr[pickIdx] == '1') continue;

            int leftDistance = Integer.MAX_VALUE; // 왼쪽 거리
            int rightDistance = Integer.MAX_VALUE; // 오른쪽 거리
            int tempAns = -1;
            
            // 1) 왼쪽은 고려하지 않아도 되는 경우
            if(pickIdx == 0) tempAns = getRightDistance(pickIdx);
            // 2) 오른쪽은 고려하지 않아도 되는 경우
            else if(pickIdx == N-1) tempAns = getLeftDistance(pickIdx);
            // 3) 양쪽 모두 고려해야 하는 경우
            else tempAns = Math.min(getLeftDistance(pickIdx), getRightDistance(pickIdx));

            // test
            // System.out.println("pickIdx : " + pickIdx + " tempAns : " + tempAns);

            // tempAns와 ans를 비교하여 최댓값 구하기
            ans = Math.max(tempAns, ans);
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 왼쪽의 거리를 구한다.
    public static int getLeftDistance(int curIdx) {
        for(int i=curIdx; i>=0; i--) {
            if(inputArr[i] == '1') return curIdx-i;
        }

        return curIdx;
    }
    // 오른쪽의 거리를 구한다.
    public static int getRightDistance(int curIdx) {
        for(int i=curIdx; i<inputArr.length; i++) {
            if(inputArr[i] == '1') return i-curIdx;
        }

        return inputArr.length-curIdx-1;
    }
}
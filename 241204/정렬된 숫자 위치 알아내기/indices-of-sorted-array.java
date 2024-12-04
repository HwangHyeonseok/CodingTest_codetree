import java.util.*;
import java.io.*;

class numArr implements Comparable<numArr> {
    int num;
    int firstIdx;

    public numArr() {
        this.num = 0;
        this.firstIdx = 0;
    }
    public numArr(int num, int firstIdx) {
        this.num = num;
        this.firstIdx = firstIdx;
    }
    @Override
    public int compareTo(numArr other) {
        if(this.num != other.num) return this.num - other.num; // 숫자 기준 정렬
        else return this.firstIdx - other.firstIdx; // 처음 인덱스 기준 정렬
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim()); // "7 " 과 같이 입력되었을 때 공백 제거 (trim)
        String input = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(input, " ");
        numArr[] numarr = new numArr[n];
        for(int i=0; i<n; i++) {
            int inputNum = Integer.parseInt(st.nextToken());
            numarr[i] = new numArr(inputNum, i);
        }
 
        // 1) 1차 sort
        // 입력받은 숫자를 기준으로 정렬, 같다면 먼저 나온 숫자 우선 정렬
        Arrays.sort(numarr);

        // 2) 정렬된 순서대로 arrayedIdx 값 채우기
        int[] arrayedIdx = new int[numarr.length];
        for(int i=0; i<numarr.length; i++) {
            arrayedIdx[numarr[i].firstIdx] = i+1;
        }

        // 3) arrayedIdx 출력
        for(int i=0; i<arrayedIdx.length; i++) {
            bw.write(arrayedIdx[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
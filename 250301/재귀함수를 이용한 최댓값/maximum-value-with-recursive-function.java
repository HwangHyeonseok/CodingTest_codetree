import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> numArr = new ArrayList<>();
    static int max = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        for(int i=0; i<n; i++) {
            numArr.add(Integer.parseInt(st.nextToken()));
        }
        // logic // 
        findMax(n-1);

        // output //
        bw.write(max+"");
        bw.flush();
        bw.close();
    }

    // 재귀 함수 : 큰 문제를 작은 문제로 자른다.
    // 작은 문제 -> 원소 두 개의 크기를 비교해서 최댓값을 저장
    public static void findMax(int n) {
        // 종료 조건
        if(n==0) return;

        // 점화식(작은 문제)
        if(max < numArr.get(n)) max = numArr.get(n); 
        findMax(n-1);
    }
}
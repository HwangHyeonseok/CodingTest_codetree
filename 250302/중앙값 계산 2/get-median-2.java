// 홀수 번째 원소가 주어질 때마다
// 지금까지 입력받은 값의 중앙값을 출력하는 프로그램
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> numList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
            if(i%2 == 0) bw.write(getMiddleNum(numList)+" ");
        }

        // output //
        bw.flush();
        bw.close();
    }

    // 중앙값을 구하는 함수
    public static int getMiddleNum(ArrayList<Integer> numList) {
        Collections.sort(numList);
            // 3개 일때는 1인덱스
            // 5개 일때는 2인덱스
        return numList.get(numList.size()/2);
    }
}
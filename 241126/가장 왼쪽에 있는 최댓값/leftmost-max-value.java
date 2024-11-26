import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // input //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // logic //
        int endIdx = N;
        while(endIdx != 0) {
            // 최댓값을 찾으면 그 인덱스 번호와 값을 임시로 담아두기
            int maxNum = -1;
            int maxNumIdx = -1;
            for(int i=0; i<endIdx; i++) {
                if(arr[i] > maxNum) {
                    maxNum = arr[i];
                    maxNumIdx = i;
                }
            }

            bw.write(String.format("%d ", maxNumIdx+1));
            endIdx = maxNumIdx; // endIdx 최신화
        }
        bw.flush();
        bw.close();
        
    }
}
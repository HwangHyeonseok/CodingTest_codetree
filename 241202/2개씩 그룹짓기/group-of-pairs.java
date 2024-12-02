import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        Integer[] arr = new Integer[N*2];
        for(int i=0; i<N*2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // logic //
        // 정렬 후 [0]+[2*N] / [1]+[2*N-1] / [2]+[2*N-2] .... 중에서 최댓값을 출력한다.
        Arrays.sort(arr, Collections.reverseOrder());
        int ans = 0;
        for(int i=0; i<N; i++) {
            int maxCheck = arr[i] + arr[2*N-1-i];
            ans = Math.max(ans, maxCheck);
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
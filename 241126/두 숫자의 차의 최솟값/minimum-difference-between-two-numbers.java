// 서로다른 두 개의 숫자를 골랐을 때, 두 숫자의 차가 최소가 되는 경우는
// 1) 정렬을 하고,
// 2) 인접한 두 개의 숫자를 비교해서 최솟값을 저장하면 된다.
// O(N) 에 해결 가능

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // input //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // logic // 
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<n-1; i++) {
            ans = ans > arr[i]-arr[i+1] ? arr[i]-arr[i+1] : ans;
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
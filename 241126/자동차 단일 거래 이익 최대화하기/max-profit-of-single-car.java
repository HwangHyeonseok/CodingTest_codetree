import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // input //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // logic //
        int minPrice = Integer.MAX_VALUE;
        int ans = 0;
        
        for(int i=0; i<n; i++) {
            // 최솟값보다 더 비싼 가격이 들어온 경우 - 가매수 진행
            if(minPrice < arr[i]) {
                ans = ans > arr[i] - minPrice ? ans : arr[i] - minPrice;
            }
            // 최솟값보다 더 싼 가격이 들어온 경우 - 최솟값을 갱신
            else {
                minPrice = arr[i];
            }
        }

        bw.write(String.format("%d", ans));
        bw.flush();
        bw.close();
    }
} 
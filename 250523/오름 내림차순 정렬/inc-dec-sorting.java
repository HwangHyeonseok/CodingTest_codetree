import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 오름차순 정렬 //
        Arrays.sort(arr);

        for(int i : arr) {
            bw.write(i+" ");
        }
        bw.write("\n");

        // 내림차순 정렬 //
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i : arr) {
            bw.write(i+" ");
        }

        
        bw.flush();
        bw.close();
    }
}
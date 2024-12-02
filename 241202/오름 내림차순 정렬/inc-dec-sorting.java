import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 sort
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.write("\n");
        
        // 내림차순 sort
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
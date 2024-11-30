import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        divide(arr);
        
        // output //
        for(int i=0; i<N; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }

    public static void divide(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) arr[i] = arr[i] / 2;
        }
    }
}
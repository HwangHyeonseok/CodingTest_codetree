import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // input //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // logic //
        Arrays.sort(arr, Collections.reverseOrder());
        
        // output //
        bw.write(String.format("%d %d", arr[0], arr[1]));
        bw.flush();
        bw.close();
    }
}
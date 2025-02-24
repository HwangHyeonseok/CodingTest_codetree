import java.util.*;
import java.io.*;

public class Main {
    static Integer[] arr1 = new Integer[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        for(int i=0; i<3; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr1, Collections.reverseOrder()); // 내림차순
        
        bw.write(String.format("%d", arr1[1]));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static Integer[] a = new Integer[101];
    static Integer[] b = new Integer[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // logic // 
        // test

        Arrays.sort(a, 0, n, Collections.reverseOrder());
        Arrays.sort(b, 0, n, Collections.reverseOrder());
        
        String ans = "Yes";
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                ans = "No"; 
                break;
            }
        }
        
        // output //
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
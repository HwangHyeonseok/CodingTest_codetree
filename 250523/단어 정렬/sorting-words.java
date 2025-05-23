import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // input // 
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
        for(int i=0; i<n; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr);
        for(String s : strArr) {
            bw.write(String.format("%s\n", s));
        }
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            // *
            for(int j=0; j<n-i; j++) {
                bw.write("*");
            }
            // 공백
            for(int j=0; j<2*i; j++) {
                bw.write(" ");
            }
            // *
            for(int j=0; j<n-i; j++) {
                bw.write("*");
            }

            bw.write("\n");
            bw.flush();
        }

        bw.close();
    }
}
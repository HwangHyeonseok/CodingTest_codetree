import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        // 위
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                bw.write("* ");
            }
            bw.write("\n");
            bw.flush();
        }

        // 아래
        for(int i=1; i<=n-1; i++) {
            for(int j=i; j<=n-1; j++) {
                bw.write("* ");
            }
            bw.write("\n");
            bw.flush();
        }

        bw.close();
    }
}
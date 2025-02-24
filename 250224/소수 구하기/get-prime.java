import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=2; i<=n; i++) {
            if(isPrime(i) == true) bw.write(i+" ");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int checkNum) {
        for(int i=2; i<=checkNum/2; i++) {
            if(checkNum%i == 0) return false;
        }

        return true;
    }
}
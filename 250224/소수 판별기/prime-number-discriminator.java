import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if(isPrime(n) == true) {
            bw.write("P");
        }
        else {
            bw.write("C");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) return false;
        }

        return true;
    }
}
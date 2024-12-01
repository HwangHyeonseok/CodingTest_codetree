import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(br.readLine());
        printNum(n);
        bw.write("\n");
        bw.flush();
        printNumReverse(n);
        bw.close();
    }

    public static void printNum(int n) {
        printNum(n-1);
        bw.write(String.format("%d ", n));
        bw.flush();
    }

    public static void printNumReverse(int n) {
        bw.write(String.format("%d ", n));
        bw.flush();
        printNum(n-1);
    }
}
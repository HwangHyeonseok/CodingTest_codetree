import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        printStar(n);
        bw.flush();
        bw.close();
    }

    public static void printStar(int n) throws IOException {
        if(n==0) return;
        
        printStar(n-1);
        bw.write("HelloWorld\n");
    }
}
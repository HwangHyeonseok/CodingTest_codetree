import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException{
        // logic //
        int n = Integer.parseInt(br.readLine());

        printStar1(n);
        bw.write("\n");
        printStar2(n);
        
        // output //
        bw.flush();
        bw.close();
    }

    public static void printStar1(int n) throws IOException {
        if(n==0) return;
        
        printStar1(n-1);
        bw.write(String.format("%d ", n));
    }

    public static void printStar2(int n) throws IOException {
        if(n==0) return;
        
        bw.write(String.format("%d ", n));
        printStar2(n-1);
    }
}
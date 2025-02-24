import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = 97;
        int b = 13;
        
        bw.write(String.format("%d - %d = %d", a,b, a-b));
        bw.flush();
        bw.close();
    }
}
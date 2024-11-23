import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = 5;
        int b = 6;
        int c = 7;
        int tempA = 5;
        int tempB = 6;
        int tempC = 7;
        
        b = tempA;
        c = tempB;
        a = tempC;
        
        bw.write(a + "\n");
        bw.write(b + "\n");
        bw.write(c + "");
        
        bw.flush();
        bw.close();
    }
}
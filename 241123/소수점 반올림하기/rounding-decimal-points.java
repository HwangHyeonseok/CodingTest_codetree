import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double a = 25.352;
        
        bw.write(String.format("%.1f", a));
        bw.flush();
        bw.close();
    }
}
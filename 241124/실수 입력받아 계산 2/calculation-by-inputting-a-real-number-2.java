import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double a = Double.parseDouble(br.readLine());
        a += 1.5;
        bw.write(String.format("%.2f", a));
        bw.flush();
        bw.close();
    }
}
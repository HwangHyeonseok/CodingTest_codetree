import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int weight = 13;
        double rate = 0.165;

        bw.write(String.format("%d * %.6f = %.6f", weight, rate, weight*rate));
        bw.flush();
        bw.close();
    }
}
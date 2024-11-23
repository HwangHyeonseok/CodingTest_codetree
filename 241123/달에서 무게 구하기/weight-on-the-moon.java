import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int weight = 13;
        double gravity = 0.165;

        String output = String.format("%d * %.6f = %.6f", weight, gravity, weight*gravity);

        bw.write(output);
        
        bw.flush();
        bw.close();
    }
}
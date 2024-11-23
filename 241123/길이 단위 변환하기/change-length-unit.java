import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double ft = 30.48;
        int mi = 160934;

        bw.write(String.format("9.2ft = %.1fcm\n", 9.2*ft));
        bw.write(String.format("1.3mi = %.1fcm", 1.3*160934));

        bw.flush();
        bw.close();
    }
}
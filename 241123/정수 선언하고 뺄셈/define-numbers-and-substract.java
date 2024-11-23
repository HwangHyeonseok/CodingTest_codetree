import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 97;
        int b = 13;
        int ans = a-b;
        bw.write(a + " - " + b + " = " + ans);

        bw.flush();
        bw.close();
    }
}
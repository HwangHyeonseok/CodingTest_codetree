import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("Hello");
        bw.newLine(); // 줄바꿈
        bw.write("World");

        bw.flush();

        bw.close();
    }
}
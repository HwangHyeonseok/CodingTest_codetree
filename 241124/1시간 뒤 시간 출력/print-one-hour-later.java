import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, ":");

        int clock = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        bw.write(String.format("%d:%d", clock+1, minute));
        bw.flush();
        bw.close();
    }
}
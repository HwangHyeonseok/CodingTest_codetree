import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, "-");
        
        String first = st.nextToken();
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        
        bw.write(String.format("%s-%d-%d", first, third, second));
        bw.flush();
        bw.close();
    }
}
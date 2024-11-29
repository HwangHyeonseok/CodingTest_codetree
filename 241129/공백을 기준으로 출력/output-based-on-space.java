import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ans = "";
        for(int i=0;i<2;i++) {
            String input = br.readLine();
            input = input.replace(" ", "");
            ans += input;
        }

        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
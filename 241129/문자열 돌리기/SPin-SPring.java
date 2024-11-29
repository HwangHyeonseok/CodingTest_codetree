import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(input+"\n");
        for(int i=0; i<input.length(); i++) {
            input = input.substring(input.length()-1) + input.substring(0, input.length()-1);
            bw.write(input+"\n");
        }
        bw.flush();
        bw.close();
    }
}
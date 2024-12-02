import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] arr = input.toCharArray();

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            bw.write(arr[i]);
        }
        bw.flush();
        bw.close();
    }
}
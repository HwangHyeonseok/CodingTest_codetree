import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String findWord = br.readLine();
        
        bw.write(input.indexOf(findWord)+"");
        bw.flush();
        bw.close();
    }
}
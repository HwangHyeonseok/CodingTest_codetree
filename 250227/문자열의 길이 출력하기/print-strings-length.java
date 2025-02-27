import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = input1+input2;

        // logic // 
        bw.write(String.format("%d", input3.length()));
        
        // output //
        bw.flush();
        bw.close();
    }
}
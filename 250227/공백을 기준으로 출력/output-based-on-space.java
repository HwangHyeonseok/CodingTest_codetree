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
        input3 = input3.replace(" ", "");
        
        // output //
        bw.write(input3);
        bw.flush();
        bw.close();
    }
}
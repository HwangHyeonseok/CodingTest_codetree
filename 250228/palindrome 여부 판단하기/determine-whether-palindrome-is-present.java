import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        
        // output //
        if(input.equals(result) == true) {
            bw.write("Yes");
        } 
        else bw.write("No");
        bw.flush();
        bw.close();
    }
}
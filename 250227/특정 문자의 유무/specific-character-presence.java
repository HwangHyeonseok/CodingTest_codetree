import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic //
        if(input.contains("ee") == true) bw.write("Yes ");
        else bw.write("No ");
        
        if(input.contains("ab") == true) bw.write("Yes");
        else bw.write("No");
        
        // output //
        bw.flush();
        bw.close();
    }
}
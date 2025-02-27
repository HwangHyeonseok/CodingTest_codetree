import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // logic // 
        if(input.indexOf("o") == -1) {
            bw.write("No");
        }
        else {
            bw.write(input.indexOf("o")+"");
        }
        
        // output //
        bw.flush();
        bw.close();
    }
}
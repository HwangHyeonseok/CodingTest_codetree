import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        // logic // 
        while(a.indexOf(b) != -1) {
            a = a.substring(0, a.indexOf(b)) + a.substring((a.indexOf(b)+b.length()));
        }
        
        // output //
        bw.write(a);
        bw.flush();
        bw.close();
    }
}
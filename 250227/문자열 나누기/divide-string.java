import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        input = input.replace(" ", "");

        // logic //
        StringBuilder sb = new StringBuilder("");
        
        for(int r=0; r<input.length(); r+=5) {
            for(int c=r; c<r+5 && c<input.length(); c++) {
                sb.append(input.charAt(c));
            }
            sb.append("\n");
        }

        // output //
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
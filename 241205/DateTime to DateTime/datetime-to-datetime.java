import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // logic // 
        // (a-11)*60*24 + (b-11)*60 + (c-11)

        int ans = (a-11)*60*24 + (b-11)*60 + (c-11);
        if(ans < 0) ans = -1;
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
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
        int ans = 0;
        ans += (a-11)*24*60; // day -> minute (1일 = 24시간 * 60분)
        ans += (b-11)*60; // hour -> minute (1시간 = 60분)
        ans += (c-11); // minute
        
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
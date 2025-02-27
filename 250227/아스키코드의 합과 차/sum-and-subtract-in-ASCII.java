import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        char s1 = st.nextToken().charAt(0);
        char s2 = st.nextToken().charAt(0);
        
        // int s1Num = (int)s1;
        // bw.write(s1Num+"");
        // output //
        bw.write(String.format("%d %d", s1+s2, Math.max(s1,s2)-Math.min(s1,s2)));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int n = 1;
        for(int i=0; i<3; i++) {
            n *= Integer.parseInt(st.nextToken());
        }

        int ans = jiraSum(n);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int jiraSum(int n) throws IOException {
        if(n < 10) return n;

        return jiraSum(n/10) + n%10;
    }
}
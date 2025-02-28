import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int ans = lcd(Math.max(n,m), Math.min(n,m));
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int gcd(int n,int m) {
        if(m == 0) return n;

        return gcd(m, n%m);
    }

    public static int lcd(int n,int m) {
        return (n*m)/gcd(n,m);
    }
}
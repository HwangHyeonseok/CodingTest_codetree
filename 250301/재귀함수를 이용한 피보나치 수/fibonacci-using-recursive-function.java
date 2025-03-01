import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // logic // 
        int ans = fact(n);
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int fact(int n) {
        if(n==1 || n==2) return 1;

        return fact(n-1)+fact(n-2); // 점화식 an = a(n-1) + a(n-2)
    }
}
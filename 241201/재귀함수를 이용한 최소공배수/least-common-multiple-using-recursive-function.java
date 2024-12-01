import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int leastCommonMultiple = arr[0];
        for(int i=1; i<N; i++) {
            leastCommonMultiple = lcm(leastCommonMultiple,arr[i]);
        }

        bw.write(leastCommonMultiple+"");
        bw.flush();
        bw.close();
    }

    // 최대공약수
    public static int gcd(int a, int remain) throws IOException{
        if(remain == 0) return a;

        return gcd(remain, a%remain);
    }
    // 최소공배수
    public static int lcm(int a, int b) throws IOException {
        return (a*b)/gcd(a,b);
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> numList = new ArrayList<>();
    static int n;
    static long ans = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        // logic // 
        multlcd(n-1);
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 최대공약수
    public static long gcd(long a, long b) {
        if(b == 0) return a;
        
        return gcd(b,a%b);
    }
    // 최소공배수
    public static long lcd(long a, long b) {
        return a*b/gcd(a,b); 
    }

    // 큰 문제 : n개의 수 최소 공배수를 구한다.
    // 작은 문제로 해결 : 특정 2개의 수를 최소 공배수를 구한다.
    //Ex) f(1,5,7,9,2,6의 최소공배수) = 1과 f(5,7,9,2,6의 최소공배수)
        // = 1과 5의 최소공배수값(7)과 f(7,9,2,6의 최소공배수)
        // = 1,5,7의 최소공배수값(35) 와 f(9,2,6의 최소공배수)
    public static void multlcd(int idx) {
        if(idx==-1) return;

        ans = lcd(ans, numList.get(idx));
        multlcd(idx-1);
    }
}
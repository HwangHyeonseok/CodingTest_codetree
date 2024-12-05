import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // logic // 
        ArrayList<Integer> digits = new ArrayList<>();
        while(n > b-1) {
            digits.add(n%b);
            n /= b; 
        } 
        digits.add(n); // 나머지 처리
        
        // output //
        for(int i=digits.size()-1; i>=0; i--) {
            bw.write(digits.get(i)+"");
        }
        bw.flush();
        bw.close();
    }
}
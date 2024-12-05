import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // logic //
        ArrayList<Integer> digits = new ArrayList<>();

        while(n > 1) {
            digits.add(n%2);
            n = n / 2;
        }
        digits.add(n);
        
        // output //
        for(int i=digits.size()-1; i >= 0; i--) {
            bw.write(digits.get(i)+"");
        }
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> digits = new ArrayList<>(); 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        // logic // 
        while(a != 0) {
            digits.add(a%2);
            a = a / 2;
        }
        
        for(int i=digits.size()-1; i>=0; i--) {
            bw.write(digits.get(i)+"");
        } 
        
        // output //
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        if(isPalindrome(input) == true) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isPalindrome(String input) {
        for(int i=0; i<input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)) return false;
        }

        return true;
    }
}
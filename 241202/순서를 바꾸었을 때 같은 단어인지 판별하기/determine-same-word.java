import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine = br.readLine();
        String secondLine = br.readLine();

        // logic // 
        // 문자들을 sort 하고 그 것이 같으면 "Yes"
        char[] word1 = firstLine.toCharArray();
        char[] word2 = secondLine.toCharArray();
        
        Arrays.sort(word1);
        Arrays.sort(word2);
        
        boolean isSame = true;
        for(int i=0; i<word1.length; i++) {
            if(word1[i] != word2[i]) {
                isSame = false;
            }
        }
        
        if(isSame == true) bw.write("Yes");
        else bw.write("No");
        
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = new String[10];
        for(int i=0;i<10;i++) {
            input[i] = br.readLine();
        }
        // 끝 글자가 해당 입력받은 글자면 출력
        String endNum = br.readLine();
        
        for(int i=0;i<10;i++) {
            if(input[i].substring(input[i].length()-1).equals(endNum)) {
                bw.write(input[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];
        for(int i=0; i<n; i++) {
            input[i] = br.readLine();
        }
        String firstChar = br.readLine();

        // logic //
        int sentenceCnt = 0;
        double StringCnt = 0.0f;
        for(int i=0;i<n;i++) {
            if(input[i].substring(0,1).equals(firstChar)) {
                sentenceCnt++;
                StringCnt += input[i].length();
            }
        }

        bw.write(String.format("%d %.2f", sentenceCnt, StringCnt/sentenceCnt));
        bw.flush();
        bw.close();
    }
}
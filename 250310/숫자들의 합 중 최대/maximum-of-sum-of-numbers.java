import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        // logic // 
        int ans = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++) {
            int tempAns = 0;
            int temp = i;
            while(temp != 0) {
                tempAns += (temp % 10); 
                temp = temp / 10;
            }

            ans = ans > tempAns ? ans : tempAns;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
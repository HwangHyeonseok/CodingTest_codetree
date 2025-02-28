// idea : 2 4 6 8 5 7 이렇게 입력 받으면 그냥 이 것이 4 6 8 문자열과 일치하는 것이 있는지 화인 

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        String input1 = br.readLine();
        String input2 = br.readLine();
        // logic // 
        String ans = "No";
        
        if(input1.contains(input2) == true) ans = "Yes";
        

        // output //
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
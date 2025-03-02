import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();

        // logic // 
        // 정렬했을 때 같은 문자열이 되면 "Yes"
        char[] input1Arr = input1.toCharArray();
        char[] input2Arr = input2.toCharArray();

        Arrays.sort(input1Arr);
        Arrays.sort(input2Arr);

        StringBuilder sb = new StringBuilder(new String(input1Arr));
        String s1 = sb.reverse().toString();

        sb = new StringBuilder(new String(input2Arr));
        String s2 = sb.reverse().toString();

        // output //
        if(s1.equals(s2)) bw.write("Yes");
        else bw.write("No");
        bw.flush();
        bw.close();
    }
}
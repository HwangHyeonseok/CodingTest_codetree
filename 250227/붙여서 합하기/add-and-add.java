import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        String firstWord = st.nextToken();
        String secondWord = st.nextToken();

        // logic // 
        StringBuilder sb = new StringBuilder("");
        String ab = sb.append(firstWord).append(secondWord).toString();
        sb = new StringBuilder("");
        String ba = sb.append(secondWord).append(firstWord).toString();
        
        int num1 = Integer.parseInt(ab);
        int num2 = Integer.parseInt(ba);

        // output //
        bw.write(String.format("%d", num1+num2));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        
        // logic //
        int day1 = 0;
        int day2 = 0; 
        for(int i=1; i<=m1-1; i++) {
            day1 += days[i];
        }
        day1 += d1;

        for(int i=1; i<=m2-1; i++) {
            day2 += days[i];
        }
        day2 += d2;

        // output //
        bw.write(String.format("%d", day2-day1+1));
        bw.flush();
        bw.close();
    }
}
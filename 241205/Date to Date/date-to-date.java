import java.util.*;
import java.io.*;

public class Main {
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
        int[] monthToDay = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1월은 31일, 2월은 28일 ...
        
        int OneDay = 0;
        int TwoDay = 0;

        // 월 계산
        for(int i=0; i<m1; i++) {
            OneDay += monthToDay[i];
        }
        for(int i=0; i<m2; i++) {
            TwoDay += monthToDay[i];
        }

        // 일 계산
        OneDay += d1;
        TwoDay += d2;

        // TwoDay - oneDay;
        int ans = Math.abs(TwoDay - OneDay);
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
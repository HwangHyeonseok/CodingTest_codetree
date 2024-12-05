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
        int[] monthToDay = {31,28,31,30,31,30,31,31,30,31,30,31};
        int oneDay = 0;
        int twoDay = 0;
        // 1) m2월 d2일 - m1월 d1일 날짜 수 구하기 //
        // 1-1) month
        for(int month=0; month<m1-1; month++) {
            oneDay += monthToDay[month];
        }
        for(int month=0; month<m2-1; month++) {
            twoDay += monthToDay[month];
        }

        // 1-2) day
        oneDay += d1;
        twoDay += d2;
        int dayDiff = twoDay - oneDay; // 2011년 m1월 d1일 - 2011년 m2월 d2일
        
        // 2) % 7 연산을 한다.
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        if(dayDiff < 0) {
            bw.write(week[7-Math.abs(dayDiff)%7]);
        }
        else {
            bw.write(week[dayDiff%7]);
        }

        // output //
        bw.flush();
        bw.close();
    }
}
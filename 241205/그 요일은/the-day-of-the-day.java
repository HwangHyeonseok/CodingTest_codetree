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
        String findWeekDay = br.readLine();

        // logic // 

        // 2024년 m2월 d2일 - 2024년 m1월 d1일 구하기
        int[] monthToDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        int oneDay = 0;
        int twoDay = 0;
        for(int month=0; month < m1-1; month++) {
            oneDay += monthToDay[month];
        }
        for(int month=0; month < m2-1; month++) {
            twoDay += monthToDay[month];
        }

        oneDay += d1;
        twoDay += d2;

        int dayDiff = twoDay - oneDay;

        // 특정 요일이 몇 번 나오는지 체크하기
        String[] week = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        int weekWeight = 0; // Ex) 찾아야 하는 요일이 화요일이면 1, 수요일이면 2...
        for(int i=0; i<week.length; i++) {
            if(week[i].equals(findWeekDay)) weekWeight = i;
        }

        int ans = 0;
        if(dayDiff > 0) {
            // 처음
            if(dayDiff >= weekWeight) {
                dayDiff -= weekWeight;
                ans++;
            }

            ans += dayDiff / 7;
        }

        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
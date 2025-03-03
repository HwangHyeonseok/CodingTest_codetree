// 차이%7 한 값 >= 0 |  0: 월, 1: 화, 2: 수, 3: 목, 4: 금, 5:토, 6:일
// 차이%7 한 값 < 0 | -1 : 일, -2: 토, -3: 금, -4: 목, -5: 수, -6: 화
import java.util.*;
import java.io.*;

public class Main {
    static int[] board = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
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
        for(int i=1; i<m1; i++) {
            day1 += board[i];
        }
        day1 += d1;

        int day2 = 0;
        for(int i=1; i<m2; i++) {
            day2 += board[i];
        }
        day2 += d2;
        
        int datediff = day2-day1;
        
        if(datediff >= 0) {
            bw.write(week[datediff%7]);
        }
        else {
            bw.write(week[(datediff%7)+7]);
        }

        // output //
        bw.flush();
        bw.close();
    }
}
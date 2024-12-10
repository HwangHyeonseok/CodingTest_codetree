import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000;
    static int[] timeTolocationA = new int[MAX_N]; // 시간에 따른 이동 거리 (Ex. 2시간에 5만큼 이동했으면 timeTolocationA[2] = 5)
    static int[] timeTolocationB = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // logic //

        // A의 이동
        int locationA = 0; // A의 현재 위치
        int timeA = 0; // 현재 시간

        for(int i=0; i<N; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            
            for(int j=0; j<t; j++) {
                locationA += v;
                timeTolocationA[++timeA] = locationA;
            }
        }

        // B의 이동
        int locationB = 0; // B의 현재 위치
        int timeB = 0; // 현재 시간
        for(int i=0; i<M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            
            for(int j=0; j<t; j++) {
                locationB += v;
                timeTolocationB[++timeB] = locationB;
            }
        }

        // A와 B의 위치가 역전되는 순간 포착하기
        int sundo = 0; // 1 : A가 선두, 2 : B가 선두
        int ans = 0;
        for(int i=0; i<=timeA; i++) {
            if(timeTolocationA[i] > timeTolocationB[i]) {
                if(sundo == 2) ans++;
                sundo = 1;
            } 
            else if(timeTolocationA[i] < timeTolocationB[i]) {
                if(sundo == 1) ans++;
                sundo = 2;
            } 
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
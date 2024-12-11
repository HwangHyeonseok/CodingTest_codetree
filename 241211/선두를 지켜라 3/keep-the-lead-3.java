import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000; // 최대 소요 시간 : t=1000, N과 M = 1000 이므로 1000*1000
    static int[] locationA = new int[MAX_N+1]; // 시간에 따라 A의 위치를 담는다.
    static int[] locationB = new int[MAX_N+1]; // 시간에 따라 B의 위치를 담는다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        // A 움직임
        int timeA = 0; 

        for(int i=0; i<N; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            
            for(int j=0; j<t; j++) {
                timeA++;
                locationA[timeA] = locationA[timeA-1]+v; 
            }
        }

        // // A의 시간에 따른 위치 체크 (Testcode)
        // for(int i=0; i<20; i++) {
        //     System.out.println("i  : " + i + " location : " + locationA[i]);
        // }

        // B 움직임
        int timeB = 0; 

        for(int i=0; i<M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j=0; j<t; j++) {
                timeB++;
                locationB[timeB] = locationB[timeB-1]+v; 
            }
        }
        
        // // B의 시간에 따른 위치 체크 (Testcode)
        // for(int i=0; i<20; i++) {
        //     System.out.println("i  : " + i + " location : " + locationB[i]);
        // }

        // A,B 명예의 전당 변경 감지 (처음에 바뀐 것도 포함시킴)
        // A의 총 이동 시간과 B의 총 이동 시간이 동일하다고 가정
        int ans = 0;

        for(int i=1; i<=timeA; i++) {
            if(locationA[i] > locationB[i] && locationA[i-1] <= locationB[i-1]) {
                ans++;
            }
            else if(locationA[i] < locationB[i] && locationA[i-1] >= locationB[i-1]) {
                ans++;
            }
            else if(locationA[i] == locationB[i] && locationA[i-1] != locationB[i-1]) {
                ans++;
            }
        }
        
        bw.write(ans+"");
        bw.flush();
        bw.close();

    }
}
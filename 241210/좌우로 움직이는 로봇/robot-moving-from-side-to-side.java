import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000;
    static int[] timeToLocationA = new int[MAX_N+1]; // 시간에 따른 A의 위치
    static int[] timeToLocationB = new int[MAX_N+1];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // logic // 

        // A 움직임 구현
        int timeA = 0; // 시간
        int locationA = 0; // A의 위치
        
        for(int i=0; i<n; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();
            
            if(d.equals("R")) {
                for(int j=0; j<t; j++) {
                    locationA++;
                    timeToLocationA[++timeA] = locationA;
                }
            }
            
            else if(d.equals("L")) {
                for(int j=0; j<t; j++) {
                    locationA--;
                    timeToLocationA[++timeA] = locationA;
                }
            }
        }


        // B 움직임 구현
        int timeB = 0; // 시간
        int locationB = 0; // B의 위치
        
        for(int i=0; i<m; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();
            
            if(d.equals("R")) {
                for(int j=0; j<t; j++) {
                    locationB++;
                    timeToLocationB[++timeB] = locationB;
                }
            }
            
            else if(d.equals("L")) {
                for(int j=0; j<t; j++) {
                    locationB--;
                    timeToLocationB[++timeB] = locationB;
                }
            }
        }
        
        // output //
        if(timeA > timeB) { // A의 이동 시간이 더 많은 경우 B는 나머지 시간을 채워준다.
            // Ex)
            // [Before]
            // timeToLocationA = {0, 1, 2, 3, 4}
            // timeToLocationB = {0, 1}
            
            // [After]
            // timeToLocationA = {0, 1, 2, 3, 4}
            // timeToLocationB = {0, 1, 1, 1, 1}

            Arrays.fill(timeToLocationB, timeB+1, timeA+1, timeToLocationB[timeB]);          
        }

        else if (timeA < timeB) {
            // Ex)
            // [Before]
            // timeToLocationA = {0, 1}
            // timeToLocationB = {0, 1, 2, 3, 4}
            
            // [After]
            // timeToLocationA = {0, 1, 1, 1, 1}
            // timeToLocationB = {0, 1, 2, 3, 4}
            Arrays.fill(timeToLocationA, timeA+1, timeB+1, timeToLocationA[timeA]);
        }
        

        // A와 B가 이전에는 달랐는데, A와 B가 같아진 순간 ans++
        int ans = 0;
        for(int i=1; i<=Math.max(timeA, timeB); i++) {
            // System.out.println("i = " + i + " A위치 : " + timeToLocationA[i] + " B위치 : " + timeToLocationB[i]);
            if(timeToLocationA[i] == timeToLocationB[i] && timeToLocationA[i-1] != timeToLocationB[i-1]) ans++;
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
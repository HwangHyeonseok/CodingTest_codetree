// 매 초마다 어디에 있었는지 기록한다.
import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000;
    static int[] timeToLocationA = new int[MAX_N+1]; // 시간에 따른 위치를 저장하는 배열
    static int[] timeToLocationB = new int[MAX_N+1];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // logic // 
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken()); // A의 이동 횟수
        int M = Integer.parseInt(st.nextToken()); // B의 이동 횟수
        
        // A 이동 입력 + 구현
        int timeA = 0; // A의 누적 이동 시간
        int locationA = 0; // A의 위치
        for(int i=0; i<N; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            String command = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());

            if(command.equals("R")) {
                for(int j=0; j<moveCnt; j++) {
                    locationA++;
                    timeToLocationA[++timeA] = locationA;
                }
            }

            else if(command.equals("L")) {
                for(int j=0; j<moveCnt; j++) {
                    locationA--;
                    timeToLocationA[++timeA] = locationA;
                }
            }
        }

        // // A 시간별 위치 테스트
        // for(int i=0; i<20; i++) {
        //     System.out.print(timeToLocationA[i] + " ");
        // }
        // System.out.println();

        // B 이동 입력 + 구현
        int locationB = 0; // 현재 B의 위치
        int timeB = 0; // B의 누적 이동 시간
        for(int i=0; i<M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            String command = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());

            if(command.equals("R")) {
                for(int j=0; j<moveCnt; j++) {
                    locationB++;
                    timeToLocationB[++timeB] = locationB;
                }
            }

            else if(command.equals("L")) {
                for(int j=0; j<moveCnt; j++) {
                    locationB--;
                    timeToLocationB[++timeB] = locationB;
                }
            }
        }

        // // B 시간별 위치 테스트
        // for(int i=0; i<20; i++) {
        //     System.out.print(timeToLocationB[i] + " ");
        // }
        // System.out.println();


        // output //
        // 만나는 순간 = 인덱스에 기록한 이동 횟수가 같은 순간 중 가장 짧은 시간이 걸리는 것을 출력
        int ans = -1;
        for(int i=1; i<=timeB; i++) {
            // System.out.println("i : " + i + " A위치 : " + timeToLocationA[i] + " B위치 : " + timeToLocationB[i]);
            if(timeToLocationA[i] == timeToLocationB[i]) {
                ans = i;
                break;
            }
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
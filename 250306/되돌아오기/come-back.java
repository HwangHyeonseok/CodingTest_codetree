import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] board = new int[2001][2001];
    static int curX = 1000; // 초기 위치는 (1000,1000) 으로 고정
    static int curY = 1000;
    static int ans = 0; // 원점까지 도달하는데 걸리는 시간

    public static void main(String[] args) throws IOException{
        
        
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            
            char command = st.nextToken().charAt(0);
            int moveCnt = Integer.parseInt(st.nextToken());
            
            if(command == 'N') moveN(moveCnt);
            else if(command == 'S') moveS(moveCnt);
            else if(command == 'W') moveW(moveCnt);
            else if(command == 'E') moveE(moveCnt);
        }
        
        // output //
        bw.flush();
        bw.close();
    }
    
    // 상방으로 이동 (y--)
    public static void moveN(int moveCnt) throws IOException {
        for(int i=0; i<moveCnt; i++) {
            curY--;
            ans++;
            if(curX == 1000 && curY == 1000) { // 원점 도착 시
                bw.write(ans+"");
            }
        }
    }

    // 하방으로 이동 (y++)
    public static void moveS(int moveCnt) throws IOException {
        for(int i=0; i<moveCnt; i++) {
            curY++;
            ans++;
            if(curX == 1000 && curY == 1000) { // 원점 도착 시
                bw.write(ans+"");
            }
        }
    }

    // 좌측으로 이동 (x--)
    public static void moveW(int moveCnt) throws IOException {
        for(int i=0; i<moveCnt; i++) {
            curX--;
            ans++;
            if(curX == 1000 && curY == 1000) { // 원점 도착 시
                bw.write(ans+"");
            }
        }
    }

    // 우측으로 이동 (x++)
    public static void moveE(int moveCnt) throws IOException {
        for(int i=0; i<moveCnt; i++) {
            curX++;
            ans++;
            if(curX == 1000 && curY == 1000) { // 원점 도착 시
                bw.write(ans+"");
            }
        }
    }
}
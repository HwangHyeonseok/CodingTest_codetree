import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 51;
    static int[][] board = new int[MAX_N][MAX_N];
    // 아래 왼쪽 오른쪽 위
    static int[] dr = {1,0,0,-1}; 
    static int[] dc = {0,-1,1,0}; 
    static int dir = 0; // 방향

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int n = Integer.parseInt(st.nextToken()); // n*n
        int t = Integer.parseInt(st.nextToken()); // t초 이동

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        
        int r = Integer.parseInt(st.nextToken())-1;
        int c = Integer.parseInt(st.nextToken())-1;
        String d = st.nextToken(); 

        // logic // 
        // 초기 방향 지정
        if(d.equals("D")) dir = 0;
        if(d.equals("L")) dir = 1;
        if(d.equals("R")) dir = 2;
        if(d.equals("U")) dir = 3;


        // 이동
        for(int i=0; i<t; i++) {
            // System.out.println(i + "번째 이동 : " + " r : " + r + " c : " + c); // 디버깅용
            int curR = dr[dir] + r;
            int curC = dc[dir] + c;
            // 범위를 벗어난 경우 -> 방향 바꾸기
            if(curR < 0 || curC < 0 || curR >= n || curC >= n) {
                dir = 3 - dir;
                continue;
            }

            // 범위 안인 경우 이동 처리
            r = curR;
            c = curC;
        }
        
        // output //
        bw.write(String.format("%s %s", r+1,c+1));
        bw.flush();
        bw.close();
    }
}
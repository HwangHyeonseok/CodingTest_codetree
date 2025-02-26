import java.util.*;
import java.io.*;

public class Main {
    static int board[] = new int[1001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        // logic - O(N^2)// 
        // 하나씩 찝어서 거기서 나올 수 있는 최대 수익이 얼마나 나는지 계산
        int ans = 0;
        int buyPrice = 0;
        int sellPrice = 0;

        for(int i=0; i<n; i++) { // 한 개를 집어낸다.
            buyPrice = board[i]; 
            for(int j=i; j<n; j++) { // 그 한 개에 대해 이익을 계산한다.
                sellPrice = board[j];
                if(sellPrice - buyPrice > ans) { // 최고 이익인 경우
                    ans = sellPrice - buyPrice;
                }
            }
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
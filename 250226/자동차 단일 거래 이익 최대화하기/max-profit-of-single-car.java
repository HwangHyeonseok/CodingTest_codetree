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
        // int ans = 0;
        // int buyPrice = 0;
        // int sellPrice = 0;

        // for(int i=0; i<n; i++) { // 한 개를 집어낸다.
        //     buyPrice = board[i]; 
        //     for(int j=i; j<n; j++) { // 그 한 개에 대해 이익을 계산한다.
        //         sellPrice = board[j];
        //         if(sellPrice - buyPrice > ans) { // 최고 이익인 경우
        //             ans = sellPrice - buyPrice;
        //         }
        //     }
        // }

        // logic - O(N) - 배열 메모이제이션 이용 //
        // 배열을 순회하면서 최소 매수가를 갱신
        // (현재 가격 - 최소 매수가) = 이익
        // 이익이 최대가 되도록 갱신
        int ans = 0; // 이익
        int minBuyPrice = Integer.MAX_VALUE; // 최소 매수가
        int temp_profit = 0; // 현재 칸의 이익

        for(int i=0; i<n; i++) {
            minBuyPrice = minBuyPrice < board[i] ? minBuyPrice : board[i];
            temp_profit = board[i] - minBuyPrice;
            if(temp_profit > ans) ans = temp_profit;
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
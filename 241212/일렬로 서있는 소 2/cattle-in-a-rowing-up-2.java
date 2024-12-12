import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 101;
    static int[] cows = new int[MAX_N];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<N; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }

        // logic // 
        int ans = 0;

        for(int i=0; i<N; i++) { // i 번째 소 선택
            for(int j=i+1; j<N; j++) { // j 번째 소 선택
                for(int k=j+1; k<N; k++) { // k 번째 소 선택
                    if(cows[i] <= cows[j] && cows[j] <= cows[k]) { // Ai <= Aj <= Ak 를 만족한다면
                        ans++; // 정답 +1
                    }
                }
            }
        }

        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
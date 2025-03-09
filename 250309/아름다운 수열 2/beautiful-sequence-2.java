import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nBoard = new int[N];
        int[] mBoard = new int[M];

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<N; i++) {
            nBoard[i] = Integer.parseInt(st.nextToken());
        }
        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<M; i++) {
            mBoard[i] = Integer.parseInt(st.nextToken());
        }
        // logic //
        int ans = 0;
        Arrays.sort(mBoard);
        for(int i=0; i<=N-M; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            boolean isSame = true;
            // M 개를 골라서 sort 하고 그 값이 모두 같은지 체크한다.
            for(int j=i; j<i+M; j++) { // M 개를 골라서 담아놓는다.
                temp.add(nBoard[j]);
            }
            // sort 한다.
            Collections.sort(temp);
            // 그 값이 모두 같은지 체크한다.
            for(int k=0; k<M; k++) {
                if(temp.get(k) != mBoard[k]) {
                    isSame = false;
                    break;
                }
            }
            if(isSame == true) ans++;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
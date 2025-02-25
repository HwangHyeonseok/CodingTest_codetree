import java.util.*;
import java.io.*;

public class Main {
    static int[] a = new int[101];
    static int[] b = new int[101]; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<n2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 연속부분수열 체크 
        // 수열 B가 수열 A의 원소들을 연속하게 뽑았을 때 나올 수 있는 수열 = 연속부분수열
        // [1,5,2,6] [5,2] 라면 연속 부분 수열

        String ans = "No";
        for(int startidx=0; startidx<=n1-n2; startidx++) {
            for(int bidx=0; bidx<n2; bidx++) {
                if(a[startidx+bidx] != b[bidx]) {
                    // System.out.println("startIdx : " + startidx + "bidx : " + bidx);
                    break;
                }

                if(a[startidx+bidx] == b[bidx] && bidx == n2-1) ans = "Yes";
            }
        }

        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
// idea : 2 4 6 8 5 7 이렇게 입력 받으면 그냥 이 것이 4 6 8 문자열과 일치하는 것이 있는지 화인 
// [반례]
// 2 1
// 22 22
// 2

import java.util.*;
import java.io.*;

public class Main {
    static int[] a = new int[101];
    static int[] b = new int[101];
    public static void main(String[] args) throws IOException{
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

        // logic // 
        String ans = "No";
        for(int i=0; i<=n1-n2; i++) {
            boolean isCombo = true; // 연속부분수열인지 체크
            for(int j=0; j<n2; j++) { // n2개를 본다.
                if(a[i+j] != b[j]) {
                    isCombo = false;
                    break;
                }
            }

            if(isCombo == true) {
                ans = "Yes";
                break;
            }
        }
        

        // output //
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}
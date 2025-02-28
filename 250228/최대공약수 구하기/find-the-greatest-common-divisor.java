// 방법2 : 유클리드 호제법 사용
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = gcd(n,m);

        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 최대공약수를 구하는 함수
    public static int gcd(int n, int m) {
        if(n%m == 0) {
            return m;
        }
        
        return gcd(m, n%m);
    }
}




// 방법1 : brute force
// 두 수 중 작은 수를 선택한 다음 1부터 작은 자연수/2 까지의 모든 수로 두 수를
// 나누면서 동시에 나누어 떨어지는 수 중 가장 큰 수를 구하는 방법 

// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         String input = br.readLine();
//         StringTokenizer st = new StringTokenizer(input, " ");

//         int n = Integer.parseInt(st.nextToken());
//         int m = Integer.parseInt(st.nextToken());

//         int ans = chaedae(n,m);

//         bw.write(ans+"");
//         bw.flush();
//         bw.close();
//     }

//     // 최대공약수를 구하는 함수
//     public static int chaedae(int n, int m) {
//         int ans = 1;
//         for(int i=2; i<=Math.min(n,m); i++) {
//             if(n%i == 0 && m%i == 0) {
//                 ans = i;
//             }
//         }

//         return ans;
//     }
    
// }
// 3,6,9 가 있거나 
// 3의 배수인 수 판별

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int i=a; i<=b; i++) {
            if(isThreeSixNine(i) || threeMultiple(i)) ans++;
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 3,6,9가 있는지 판별
    public static boolean isThreeSixNine(int num) {
        String numStr = num+"";
        char[] numChar = numStr.toCharArray();
        for(int i=0; i<numChar.length; i++) {
            if(numChar[i] == '3' || numChar[i] == '6' || numChar[i] == '9') return true;
        }
        
        return false;
    }

    // 3의 배수 판별
    public static boolean threeMultiple(int num) {
        if(num % 3 == 0) return true;
        else return false;
    }
}
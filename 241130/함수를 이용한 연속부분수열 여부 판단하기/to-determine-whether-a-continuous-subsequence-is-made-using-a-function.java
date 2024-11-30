import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // firstLine input //
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int Alen = Integer.parseInt(st.nextToken());
        int Blen = Integer.parseInt(st.nextToken());
        
        // secondLine input //
        String AArrinput = br.readLine();
        StringTokenizer st2 = new StringTokenizer(AArrinput, " ");
        
        int[] aArr = new int[Alen];
        for(int i=0; i<Alen; i++) {
            aArr[i] = Integer.parseInt(st2.nextToken());
        }

        // thirdLine input //
        String BArrinput = br.readLine();
        StringTokenizer st3 = new StringTokenizer(BArrinput, " ");
        
        int[] bArr = new int[Blen];
        for(int i=0; i<Blen; i++) {
            bArr[i] = Integer.parseInt(st3.nextToken());
        }

        if(isContinueArr(aArr, bArr) == true) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }

    // logic //
    static boolean isContinueArr(int[] aArr, int[] bArr) {
        for(int i=0; i<(aArr.length-bArr.length)+1; i++) {
            boolean match = true;
            for(int j=0; j<bArr.length; j++) {
                if(aArr[i+j] != bArr[j]) match = false;
            }

            if(match == true) return true;
        }

        // 다 했는데도 같은게 없는 경우
        return false;
    }
}
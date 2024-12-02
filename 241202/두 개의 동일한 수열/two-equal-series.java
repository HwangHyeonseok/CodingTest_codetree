import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // firstline
        String input = br.readLine();
        Integer[] aArr = new Integer[n];
        Integer[] bArr = new Integer[n];
        StringTokenizer st = new StringTokenizer(input, " "); // secondline
        for(int i=0; i<n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        input = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input, " "); // secondline
        for(int i=0; i<n; i++) {
            bArr[i] = Integer.parseInt(st2.nextToken());
        }

        // logic //
        Arrays.sort(aArr, Collections.reverseOrder());
        Arrays.sort(bArr, Collections.reverseOrder());

        boolean isSame = true;
        for(int i=0; i<aArr.length; i++) {
            if(aArr[i] != bArr[i]) {
                isSame = false;
                break;
            }
        }

        if(isSame == true) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }
}
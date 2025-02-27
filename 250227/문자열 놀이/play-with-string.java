import java.util.*;
import java.io.*;

public class Main {
    static String s="";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        s = st.nextToken();
        int q = Integer.parseInt(st.nextToken());

        for(int i=0; i<q; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int command = Integer.parseInt(st.nextToken());

            if(command == 1) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                swapabIdx(a, b);
                bw.write(s+"\n");
            }
            else if (command == 2) {
                String x = st.nextToken();
                String y = st.nextToken();
                swapab(x, y);
                bw.write(s+"\n");
            }
        }
        
        // output //
        bw.flush();
        bw.close();
    }

    // logic // 
    public static void swapabIdx(int aIndex, int bIndex) {
        int minIdx = Math.min(aIndex, bIndex); // 1
        int maxIdx = Math.max(aIndex, bIndex); // 2
        

        s = s.substring(0,minIdx-1) + s.charAt(maxIdx-1) + s.substring(minIdx, maxIdx-1) + s.charAt(minIdx-1) + s.substring(maxIdx);
    }

    public static void swapab(String x, String y) {
        s = s.replace(x, y);
    }

}
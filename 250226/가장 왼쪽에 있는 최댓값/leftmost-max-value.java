import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        int maxVal = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i=1; i<=n; i++) {
            int checkNum = Integer.parseInt(st.nextToken());
            if(maxVal < checkNum) {
                maxVal = checkNum;
                maxIdx = i;
                ans.add(i);
            }
        }
        
        // output //
        for(int i=ans.size()-1; i>=0; i--) {
            bw.write(ans.get(i)+" ");
        }
        bw.flush();
        bw.close();
    }
}
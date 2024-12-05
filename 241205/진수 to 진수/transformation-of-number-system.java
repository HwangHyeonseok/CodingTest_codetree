import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String n = br.readLine().trim();

        // logic // 
        // a 진수 -> 10진수
        int weight = 1;
        int jinsu10 = 0;
        for(int i=n.length()-1; i>=0; i--) {
            jinsu10 += (n.charAt(i)-'0') * weight;
            weight *= a;
        } 

        // 10진수 -> b 진수
        ArrayList<Integer> ans = new ArrayList<>();
        while (jinsu10 > b-1) {
            ans.add(jinsu10%b);
            jinsu10 /= b;
        }
        ans.add(jinsu10);// 마지막 처리
        
        // output //
        for(int i=ans.size()-1; i>=0; i--) {
            bw.write(ans.get(i)+"");
        }
        bw.flush();
        bw.close();
    }
}
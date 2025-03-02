import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<String> sList;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        sList = new ArrayList<>();


        // logic // 
        // 문자열 t가 포함되는 것만 넣기
        String temp = "";
        for(int i=0; i<n; i++) {
            temp = br.readLine();
            if(temp.contains(t) == true) {
                sList.add(temp);
            }
        }

        // 사전순 정렬 - 오름차순 정렬
        Collections.sort(sList);
        
        // k번째 문자열 출력
        bw.write(sList.get(k-1));
        
        // output //
        bw.flush();
        bw.close();
    }
}
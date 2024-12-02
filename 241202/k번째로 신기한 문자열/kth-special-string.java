import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();

        List<String> words = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String checkWord = br.readLine();
            if(checkWord.contains(T)) {
                words.add(checkWord);
            }
        }
        
        // logic //
        // 사전순 정렬 - 문자열 오름차순
        Collections.sort(words);
        bw.write(words.get(k-1));
        bw.flush();
        bw.close();
    }
}
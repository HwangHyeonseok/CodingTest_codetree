import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
            if((i+1) % 2 != 0) { // 홀수 번째 수를 읽을 때마다 중앙값 출력
                GetMiddle(arr);
            }
        }

        bw.flush();
        bw.close();
        
    }

    // 중앙값 구하는 함수
    public static void GetMiddle(ArrayList arr) throws IOException {
        Collections.sort(arr);
        bw.write(arr.get(arr.size() / 2) + " ");
    }
}
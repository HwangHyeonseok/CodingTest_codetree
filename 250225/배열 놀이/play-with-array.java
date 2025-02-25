import java.util.*;
import java.io.*;

public class Main {
    static int[] nArr = new int[101];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    public static void main(String[] args) throws IOException {
        

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<q; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            
            int option = Integer.parseInt(st.nextToken());
            int command = Integer.parseInt(st.nextToken());

            if(option == 1) firstOption(command);
            else if(option == 2) secondOption(command);
            else if(option == 3) {
                int command2 = Integer.parseInt(st.nextToken());
                thirdOption(command, command2);
            }

            bw.flush();
        }
        bw.close();
    }

    // command 번째 원소 출력
    public static void firstOption(int command) throws IOException {
        bw.write(nArr[command-1]+"\n");
    }

    // 값이 command인 원소를 찾아 그 원소가 몇 번째 원소인지 출력
    public static void secondOption(int command) throws IOException {
        for(int i=0; i<n; i++) {
            if(nArr[i] == command) {
                bw.write(String.format("%d\n", i+1));
                return;
            }
        }
    }

    // 3 s e : s 번째 원소부터 e 번째 원소까지 각 원소의 값을 공백으로 구분
    public static void thirdOption(int command, int command2) throws IOException {
        for(int i=command-1; i<=command2-1; i++) {
            bw.write(nArr[i]+" ");
        }
        bw.write("\n");
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // input // 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[][] arr = new String[5][3];

        for(int r=0; r<5; r++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int c=0; c<3; c++) {
                arr[r][c] = st.nextToken();
            }
        }

        // logic // 
        for(int r=0; r<5; r++) {
            for(int c=0; c<3; c++) {
                bw.write(String.format("%s ", arr[r][c].toUpperCase())); 
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
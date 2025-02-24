import java.util.*;
import java.io.*;

public class Main {
    static String[] strArr = {"L", "E", "B", "R", "O", "S"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String find = br.readLine();

        int ans = -1;
        for(int i=0; i<6; i++) {
            if(find.equals(strArr[i]) == true) {
                ans = i;
            }
        }

        if(ans == -1) bw.write("None");
        else bw.write(String.format("%d", ans));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // firstLine input //
        String input = br.readLine();
        
        // secondLine input //
        String AArrinput = br.readLine();
        AArrinput = AArrinput.replace(" ", "");

        // thirdLine input //
        String BArrinput = br.readLine();
        BArrinput = BArrinput.replace(" ", "");

        if(isContinueArr(AArrinput, BArrinput) == true) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }

    // logic //
    static boolean isContinueArr(String AArrinput, String BArrinput) {
        if(AArrinput.contains(BArrinput) == true) { // 또는 AArrinput.indexOf(BArrinput) != -1
            return true;
        }
        else {
            return false;
        }
    }
}
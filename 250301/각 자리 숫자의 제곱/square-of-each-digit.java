import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{

        int input = Integer.parseInt(br.readLine());
        // logic // 
        int ans = cal(input, 0);

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    public static int cal(int input, int result) {
        if(input == 0) return result;

        return cal(input/10, result + (input%10)*(input%10));
    }
}
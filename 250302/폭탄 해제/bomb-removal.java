import java.util.*;
import java.io.*;

class Bomb {
    String code;
    String color;
    int sec;

    public Bomb() {
        this.code = "";
        this.color = "";
        this.sec = 0;
    }

    public Bomb(String code, String color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
};

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        String code = st.nextToken();
        String color = st.nextToken();
        int sec = Integer.parseInt(st.nextToken());
        
        Bomb b = new Bomb(code, color, sec);
        
        // output //
        bw.write(String.format("code : %s\n", b.code));
        bw.write(String.format("color : %s\n", b.color));
        bw.write(String.format("second : %s\n", b.sec));
        bw.flush();
        bw.close();
    }
}
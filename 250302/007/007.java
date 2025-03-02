import java.util.*;
import java.io.*;

class People {
    String code;
    String location;
    int time;
    public People() {
        this.code="";
        this.location="";
        this.time=0;
    }

    public People(String code, String location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
};


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        // logic // 
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        int t = Integer.parseInt(st.nextToken());
        People p = new People(s1,s2,t);
        
        // output //
        bw.write(String.format("secret code : %s\n", p.code));
        bw.write(String.format("meeting point : %s\n", p.location));
        bw.write(String.format("time : %d\n", p.time));
        bw.flush();
        bw.close();
    }
}
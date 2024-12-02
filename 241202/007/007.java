import java.util.*;
import java.io.*;

class Agent {
    String secretCode;
    String location;
    int time;

    public Agent(String secretCode, String location, int time) {
        this.secretCode = secretCode;
        this.location = location;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        String s = st.nextToken();
        String l = st.nextToken();
        int t = Integer.parseInt(st.nextToken());
        Agent agent = new Agent(s,l,t);
        bw.write(String.format("secret code : %s\n", agent.secretCode));
        bw.write(String.format("meeting point : %s\n", agent.location));
        bw.write(String.format("time : %s\n", agent.time));

        bw.flush();
        bw.close();
    }
}
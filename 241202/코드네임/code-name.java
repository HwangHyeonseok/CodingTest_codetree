import java.util.*;
import java.io.*;

class Agent implements Comparable<Agent> {
    String codeName;
    int score;

    public Agent() {
        codeName = "";
        score = 0;
    }

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }

    // 정렬
    @Override
    public int compareTo(Agent other) {
        return Integer.compare(this.score, other.score); // 점수를 기준으로 오름차순 정렬
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Agent[] agents = new Agent[5];
        for(int i=0; i<5; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String code = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            agents[i] = new Agent(code, s);
        }

        // 점수가 가장 낮은 Agent의 정보 출력 하려면?
        Arrays.sort(agents);
        
        bw.write(String.format("%s %d", agents[0].codeName, agents[0].score));
        bw.flush();
        bw.close();
    }
}
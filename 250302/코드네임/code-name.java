import java.util.*;
import java.io.*;

class Agent {
    String codeName;
    int score;
    
    public Agent() {
        codeName="";
        score=0;
    }
    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
};

// Agent 객체의 score 멤버 변수를 기준으로 오름차순 정렬
class AgentScoreSort implements Comparator<Agent> {
    @Override
    public int compare(Agent o1, Agent o2) {
        return o1.score - o2.score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Agent[] agents = new Agent[5];
        for(int i=0; i<5; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            agents[i] = new Agent(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        // logic // 
        Arrays.sort(agents, new AgentScoreSort());
        

        // output //
        bw.write(String.format("%s %d", agents[0].codeName, agents[0].score));
        bw.flush();
        bw.close();
    }
}
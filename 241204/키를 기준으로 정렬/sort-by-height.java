import java.util.*;
import java.io.*;

class People implements Comparable<People>{
    String name;
    Integer height;
    int weight;

    public People() {
        this.name = "";
        this.height = 0;
        this.weight = 0;
    }

    public People(String name, Integer height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People other) {
        return this.height.compareTo(other.height);
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        People[] people = new People[n];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            people[i] = new People(name, height, weight);
        }

        // 정렬 (오름차순)
        Arrays.sort(people);
        // 모두 출력
        for(int i=0; i<people.length; i++) {
            bw.write(String.format("%s %d %d\n", people[i].name, people[i].height, people[i].weight));
        }
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

class Knight {
    String id;
    int level;

    // 기본 생성자
    public Knight() {
        id = "";
        level = 0;
    }
    public Knight(String id, int level) {
        this.id = id;
        this.level = level;
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Knight knight1 = new Knight("codetree", 10);
        Knight knight2 = new Knight();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        knight2.id = st.nextToken();
        knight2.level = Integer.parseInt(st.nextToken());
        
        bw.write(String.format("user %s lv %d\n", knight1.id, knight1.level));
        bw.write(String.format("user %s lv %d\n", knight2.id, knight2.level));
        bw.flush();
        bw.close();
    }
}
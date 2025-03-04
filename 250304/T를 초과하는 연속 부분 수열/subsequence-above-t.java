import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> board = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input, " ");
 
        for(int i=0; i<n; i++) {
            board.add(Integer.parseInt(st.nextToken()));
        }
        // logic // 
        int maxCombo = 0;
        int curCombo = 0;
        for(int i=0; i<board.size(); i++) {
            if(board.get(i) > t) curCombo++;
            else {
                maxCombo = maxCombo > curCombo ? maxCombo : curCombo;
                curCombo = 0;
            }
        }
        
        // output //
        bw.write(maxCombo+"");
        bw.flush();
        bw.close();
    }
}
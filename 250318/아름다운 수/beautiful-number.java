// 14:17
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] visited = new int[N];
        ArrayList<Integer> curr = new ArrayList<>();

        // logic // 
        permutation(N, curr, visited);
        
        // output //
        bw.write(result.size()+"");
        bw.flush();
        bw.close();
    }

    // 아름다운 수인지 체크
    public static boolean isBeautifulNum(ArrayList<Integer> curr) {
        
        int comboCnt = 0; // 같은 수가 연속된 횟수
        int prevNum = 0; // 이전 숫자  
        for(int i=0; i<curr.size(); i++) {
            int curNum = curr.get(i); // 현재 숫자

            if(i == 0) { // 처음
                prevNum = curNum;
                comboCnt++;
                continue;
            }

            // 이전 숫자와 같은 경우
            if(curNum == prevNum) {
                comboCnt++;
            }

            // 이전 숫자와 다른 경우
            else {
                // 이전 숫자들이 아름다운 수 규칙에 맞는지 체크
                if(comboCnt%prevNum != 0) return false; // 아름다운 수 규칙 위배
                prevNum = curNum;
                comboCnt = 1;
            }
        }

        // 마지막 처리
        if(comboCnt % prevNum != 0) return false;

        return true;
    }

    // permutation 
    public static void permutation(int N, ArrayList<Integer> curr, int[] visited) {
        // basecase
        if(curr.size() == N) {
            if(isBeautifulNum(curr) == true) {
                result.add(new ArrayList<Integer>(curr));
            }
            return;
        }

        // recursive call
        for(int i=1; i<=4; i++) {
            // if(visited[i] == true) continue; // 중복이 가능하므로 주석 처리
            
            // before recursive
            curr.add(i);
            // visited[i] = true; 
            
            // recursive
            permutation(N, curr, visited);

            // after recursive
            curr.remove(curr.size()-1);
            // visited[i] = false;
        }
    }
}
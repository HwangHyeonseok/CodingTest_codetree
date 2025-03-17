// 1 2 와 2 1 은 다른 것으로 본다. = 순서가 중요 = Permutation 
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>(); // 정답을 담은 원소
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int K = Integer.parseInt(st.nextToken()); // 1~K 중에서
        int N = Integer.parseInt(st.nextToken()); // N개를 고른다.
        
        boolean[] visited = new boolean[K+1]; // 방문 여부 체크 | 0은 공석
        ArrayList<Integer> curr = new ArrayList<>(); // 현재 담긴 원소

        // logic // 
        permutation(N, K, visited, curr);
        printList();
        // output //
        bw.close();
    }

    // 현재 리스트에 담긴 원소를 출력
    public static void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(ArrayList<Integer> list : result) {
            bw.write(list.get(0)+" "+list.get(1)+"\n");
            // System.out.println(list.get(0)+" "+list.get(1));
        }
        bw.flush();
    }

    public static void permutation(int N, int K, boolean[] visited, ArrayList<Integer> curr) {
        // basecase
        if(N == curr.size()) {
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        // recursive call
        for(int i=1; i<=K; i++) {
            // if(visited[i] == true) continue; // 이미 있는 원소는 체크하지 않음
            // before recursive
            curr.add(i);
            visited[i] = true;
            // recursive
            permutation(N, K, visited, curr);
            // after recursive
            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }


}
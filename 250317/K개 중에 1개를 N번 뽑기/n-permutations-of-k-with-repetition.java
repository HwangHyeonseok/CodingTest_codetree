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
        List<Integer> curr = new ArrayList<>();
        boolean[] visited = new boolean[K+1];
        
        // logic // 
        permutation(K, N, curr, visited);
        printList();
        // output //
        bw.close();
    }

    // 현재 리스트에 담긴 원소를 출력
    public static void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(ArrayList<Integer> list : result) {
            for(int i=0; i<list.size(); i++) {
                bw.write(list.get(i)+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void permutation(int K, int N, List<Integer> curr, boolean[] visited) {
        // basecase
        if(curr.size() == N) {
            result.add(new ArrayList<Integer>(curr));
            return;
        }

        // recursive call
        for(int i=1; i<=K; i++) {
            // if(visited[i] == true) continue; // 이미 있는 값인 경우(중복을 제거해야 하는 경우 사용)
            // before recursive
            curr.add(i);
            visited[i] = true; // (중복을 제거해야 하는 경우 사용)
            // recursive
            permutation(K,N,curr,visited);
            // after recursive
            curr.remove(curr.size()-1);
            visited[i] = false; // (중복을 제거해야 하는 경우 사용)
        }
    }


}
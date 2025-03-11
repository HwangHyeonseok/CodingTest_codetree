import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> board = new ArrayList<>();
    static ArrayList<Integer> tempBoard = new ArrayList<>();
    static ArrayList<Integer> delTempBoard = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<N; i++) {
            board.add(Integer.parseInt(st.nextToken()));
        }

        // logic // 
        int ans = Integer.MAX_VALUE;
        for(int multIdx=0; multIdx<N; multIdx++) { // 2배 할 인덱스
            tempBoard = new ArrayList<>();
            tempBoard.addAll(board); // board 리스트를 복사해둔다.
            tempBoard.set(multIdx, tempBoard.get(multIdx)*2); // tempBoard[multIdx] = tempBoard[multIdx]*2;
            for(int delIdx =0; delIdx<N; delIdx++) { // 제거할 인덱스
                delTempBoard = new ArrayList<>();
                delTempBoard.addAll(tempBoard);
                // 임시로 제거 처리
                delTempBoard.remove(delIdx);
                // test //
                // for(int i=0; i<delTempBoard.size(); i++) {
                //     System.out.print(delTempBoard.get(i) + " ");
                // }

                // 인접한 숫자간의 차의 합 구하기
                int tempAns = 0;

                for(int i=0; i<N-2; i++) {
                    tempAns += Math.abs(delTempBoard.get(i)-delTempBoard.get(i+1));
                }
                // test // 
                // System.out.println("tempAns : " + tempAns + " multIdx : " + multIdx + " delIdx : " + delIdx);

                // 만약 tempAns가 더 작은 경우 답(ans) 갱신
                ans = Math.min(tempAns, ans);
            }
        }
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
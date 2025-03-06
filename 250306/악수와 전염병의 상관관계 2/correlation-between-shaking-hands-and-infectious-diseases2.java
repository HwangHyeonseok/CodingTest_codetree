import java.util.*;
import java.io.*;

class Virus {
    int t; int x; int y;
    public Virus() {this.t = 0; this.x=0; this.y=0;}

    public Virus(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }
}

// t를 기준으로 오름차순 정렬
class timeOrder implements Comparator<Virus> {
    @Override
    public int compare(Virus o1, Virus o2) {
        return o1.t - o2.t;
    }
}

public class Main {
    static int[] board = new int[101]; // 0 : 음성, 1 : 양성
    static ArrayList<Virus> virusList = new ArrayList<>(); // 전염 command 저장
    static int[] clabCnt = new int[101]; // 2번 까지만 감염시킨다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int N = Integer.parseInt(st.nextToken()); // 개발자 수
        int K = Integer.parseInt(st.nextToken()); // K번 동안만 전염병을 옮기게 된다.
        int P = Integer.parseInt(st.nextToken()); // 처음 전염병에 걸린 개발자
        int T = Integer.parseInt(st.nextToken()); // command 횟수
        
        for(int i=0; i<T; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            // t 초에 x, y 개발자가 악수를 나누었음 (항상 x != y, 입력으로 주어지는 t도 모두 다름)
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            virusList.add(new Virus(t,x,y));
        }
        // 0) 처음 바이러스 감염된 개발자 처리
        board[P] = 1;

        // 1) Virus 객체를 시간을 기준으로 오름차순 정렬
        Collections.sort(virusList, new timeOrder());

        // 2) 감염 로직 진행
        for(int i=0; i<T; i++) {
            int dev1 = virusList.get(i).x; // 1번 개발자 index 저장
            int dev2 = virusList.get(i).y; // 2번 개발자 index 저장

            // 둘 다 감염되지 않은 경우 -> 수정 필요 X
            // 둘 다 감염된 경우
            if(board[dev1] == 1 && board[dev2] == 1) {
                clabCnt[dev1]++;
                clabCnt[dev2]++;
            }
            // 둘 중 한 명이 감염된 경우
            else if(board[dev1] == 1 && clabCnt[dev1] < K) {  // 1번 개발자가 감염이 되었고, 악수 횟수가 2회 이하인 경우 -> 감염처리
                board[dev2] = 1;
                clabCnt[dev1]++;
            }
            else if(board[dev2] == 1 && clabCnt[dev2] < K) { // 2번 개발자가 감염이 되었고, 악수 횟수가 2회 이하인 경우 -> 감염처리
                board[dev1] = 1;
                clabCnt[dev2]++;
            }
        }

        // 3) 출력
        for(int i=1; i<=N; i++) {
            bw.write(board[i]+"");
        }
        bw.flush();
        bw.close();
    }
}
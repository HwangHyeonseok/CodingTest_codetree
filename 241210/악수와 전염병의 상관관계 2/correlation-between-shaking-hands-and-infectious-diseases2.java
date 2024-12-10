import java.util.*;
import java.io.*;

// 악수에 대한 클래스 정의 
class HandClap implements Comparable<HandClap> {
    int time; // 악수한 시간
    int developerFrom;
    int developerTo;

    public HandClap() {
        this.time = 0;
        this.developerFrom = 0;
        this.developerTo = 0;
    }
    public HandClap(int time, int developerFrom, int developerTo) {
        this.time = time;
        this.developerFrom = developerFrom;
        this.developerTo = developerTo;
    }
    @Override
    public int compareTo(HandClap other) {
        return this.time - other.time; // 시간 순 오름차순 정렬
    }
};

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken()); // 개발자 수
        int K = Integer.parseInt(st.nextToken()); // 악수 횟수(감염)
        int P = Integer.parseInt(st.nextToken()); // 처음 전염병에 걸려 있는 개발자 번호
        int T = Integer.parseInt(st.nextToken()); // 악수 총 횟수

        ArrayList<HandClap> handClapList = new ArrayList<>(); // 악수 정보
        int[] developer = new int[N+1]; // 개발자 정보 (0번은 사용하지 않음.)
        developer[P] = 1; // 초기 감염자 처리

        for(int i=0; i<T; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            handClapList.add(new HandClap(t, x, y));
        }

        // logic // 
        // 악수한 시간 순으로 정렬
        Collections.sort(handClapList); 

        // K개 만큼만 감염 처리

        // 감염 시작 시점 찾기
        int time = 0;
        while(true) {
            if(developer[handClapList.get(time).developerFrom] == 1 || developer[handClapList.get(time).developerTo] == 1) {
                break;
            }
            time++;
        }
        // System.out.println(time);

        // 최초 개발자가 감염시킨 이후로부터 K개 감염 시작
        for(int i=time; i<Math.min(time+K, handClapList.size()); i++) {
            // 둘 중 하나가 감염자일 경우 -> 둘 다 감염 처리
            if(developer[handClapList.get(i).developerFrom] == 1 || developer[handClapList.get(i).developerTo] == 1) {
                developer[handClapList.get(i).developerFrom] = 1;
                developer[handClapList.get(i).developerTo] = 1;
            }
        }


        
        
        // output //
        // 감염 정보 출력
        for(int i=1; i<developer.length; i++) {
            bw.write(developer[i]+"");
        }
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

class Rect {
    int x;
    int y;
    
    public Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }
};

public class Main {
    static ArrayList<Rect> rectList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            rectList.add(new Rect(x,y));
        }

        // logic //
        int ans = Integer.MAX_VALUE; // 모든 점을 포함하는 직사각형의 최소 넓이

        for(int removeIdx=0; removeIdx < N; removeIdx++) { // 없앨 인덱스 1개 pick
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            // 없앤 1개를 제외하고 연산을 취한다.
            // (최대 x - 최소 x) * (최대 y - 최소 y) = 직사각형의 넓이
            for(int i=0; i< N; i++) { 
                if(removeIdx == i) continue;
                
                maxX = maxX > rectList.get(i).x ? maxX : rectList.get(i).x;
                maxY = maxY > rectList.get(i).y ? maxY : rectList.get(i).y;
                minX = minX < rectList.get(i).x ? minX : rectList.get(i).x;
                minY = minY < rectList.get(i).y ? minY : rectList.get(i).y;
            }

            // 직사각형의 넓이 구하기
            int tempAns = (maxX - minX) * (maxY - minY);
            ans = ans < tempAns ? ans : tempAns;
        }

        // logic // 
        
        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
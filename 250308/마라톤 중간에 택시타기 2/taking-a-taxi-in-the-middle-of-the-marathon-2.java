import java.util.*;
import java.io.*;

class Point {
    int curX;
    int curY;
    public Point(int curX, int curY) {
        this.curX = curX;
        this.curY = curY;
    }
};

public class Main {
    static ArrayList<Point> pointList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pointList.add(new Point(x,y));
        }

        // test //
        // for(int i=0; i<pointList.size(); i++) {
        //     System.out.println(pointList.get(i).curX);
        // }

        // logic //
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<pointList.size()-1; i++) { // 첫 번째와 마지막 번째 것은 빼지 않는다.
            int tempAns = getDistance(i);
            ans = ans < tempAns ? ans : tempAns;
        }

        // output //
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }

    // 특정 인덱스를 빼고 총 이동 거리를 구하는 함수
    public static int getDistance(int removeIdx) {
        int xPos = 0;
        int yPos = 0;
        int moveCnt = 0; // 이동 거리
        for(int j=0; j<pointList.size(); j++) {
            if(j == removeIdx) continue;
            if(j == 0) { // 1번 체크포인트인 경우 시작 위치 설정
                xPos = pointList.get(j).curX;
                yPos = pointList.get(j).curY;
                continue;
            }

            // 2번 체크포인트의 경우 이동 + 위치 최신화
                // 이동
            moveCnt += Math.abs(xPos-pointList.get(j).curX) + Math.abs(yPos-pointList.get(j).curY);
                // 위치 최신화
            xPos += pointList.get(j).curX;
            yPos += pointList.get(j).curY;
        }
        return moveCnt;
    }
}
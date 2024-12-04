import java.util.*;
import java.io.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    int num; // 지점 번호
    
    public Point() {
        this.x = 0;
        this.y = 0;
        this.num = 0;
    }
    public Point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
    @Override
    public int compareTo(Point other) {
        // 거리 오름차순
        if((Math.abs(this.x) + Math.abs(this.y)) != (Math.abs(other.x) + Math.abs(other.y))) {
            return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(other.x) + Math.abs(other.y));
        }
        // 번호 오름차순
        else {
          return this.num - other.num;
        }
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Point[] point = new Point[n];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            point[i] = new Point(x, y, i+1);
        }
        
        Arrays.sort(point);

        // output //
        for(int i=0; i<point.length; i++) {
            bw.write(point[i].num+"\n");
        } 
        bw.flush();
        bw.close();
    }
}
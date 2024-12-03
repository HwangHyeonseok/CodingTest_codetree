import java.util.*;
import java.io.*;

class Gisang implements Comparable<Gisang> {
    String date;
    String week;
    String weather;

    public Gisang() {
        this.date = "";
        this.week = "";
        this.weather = "";
    }

    public Gisang(String date, String week, String weather) {
        this.date = date;
        this.week = week;
        this.weather = weather;
    }

    @Override
    public int compareTo(Gisang other) {
        return this.date.compareTo(other.date); // date 순으로 오름차순 정렬
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Gisang> gisang = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String date = st.nextToken();
            String week = st.nextToken();
            String weather = st.nextToken();
            
            if(weather.equals("Rain")) { // 비가 오는 날씨일 때만 리스트에 넣는다.
                gisang.add(new Gisang(date, week, weather));
            }
        }

        // 정렬
        Collections.sort(gisang);

        // // 정렬 결과 출력
        // for(int i=0; i<gisang.size();i++) {
        //     System.out.println(gisang.get(i).date);
        // }

        // 가장 근 시일내에 비가 오는 날 정보 출력
        bw.write(String.format("%s %s %s", gisang.get(0).date, gisang.get(0).week, gisang.get(0).weather));
        bw.flush();
        bw.close();
    }
}
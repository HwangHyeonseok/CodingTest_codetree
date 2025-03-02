import java.util.*;
import java.io.*;

class Info {
    String date;
    String week;
    String weather;

    public Info() {
        this.date = "";
        this.week = "";
        this.weather = "";
    }

    public Info(String date, String week, String weather) {
        this.date = date;
        this.week = week;
        this.weather = weather;
    }
};
// date 기준으로 오름차순 정렬
class SortInfo implements Comparator<Info> {
    @Override
    public int compare(Info o1, Info o2) {
        return o1.date.compareTo(o2.date);
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Info> infoList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
    
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            String date = st.nextToken();
            String week = st.nextToken();
            String weather = st.nextToken();
            if(weather.equals("Rain")) {
                infoList.add(new Info(date, week, weather));
            }
        }

        // logic //
        Collections.sort(infoList, new SortInfo());
        
        // output //
        bw.write(String.format("%s %s %s", infoList.get(0).date, infoList.get(0).week, infoList.get(0).weather));
        bw.flush();
        bw.close();
    }
}
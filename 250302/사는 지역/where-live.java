import java.util.*;
import java.io.*;

class People {
    String name;
    String bunji;
    String location;

    public People() {
        this.name = "";
        this.bunji = "";
        this.location = "";
    }

    public People(String name, String bunji, String location) {
        this.name = name;
        this.bunji = bunji;
        this.location = location;
    }
};
// 이름 기준 내림차순 정렬
class SortPeople implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) { 
        return o2.name.compareTo(o1.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<People> peopleList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            String name = st.nextToken();
            String bunji = st.nextToken();
            String loc = st.nextToken();

            peopleList.add(new People(name, bunji, loc));
        }


        // logic // 
        // 사전순으로 이름이 가장 느린 사람의 자료
        Collections.sort(peopleList, new SortPeople());

        
        // output //
        bw.write(String.format("name %s\n", peopleList.get(0).name));
        bw.write(String.format("addr %s\n", peopleList.get(0).bunji));
        bw.write(String.format("city %s\n", peopleList.get(0).location));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    String bunji;
    String location;
    
    public Person() {
        this.name = "";
        this.bunji = "";
        this.location = "";
    }

    public Person(String name, String bunji, String location) {
        this.name = name;
        this.bunji = bunji;
        this.location = location;
    }

    // 객체 정렬
    @Override
    public int compareTo(Person other) {
        return other.name.compareTo(this.name); // 이름을 기준으로 오름차순
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Person[] p = new Person[n];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken();
            String bunji = st.nextToken();
            String location = st.nextToken();
            p[i] = new Person(name, bunji, location);
        }

        // 정렬
        Arrays.sort(p);

        // output
        bw.write(String.format("name %s\n", p[0].name));
        bw.write(String.format("addr %s\n", p[0].bunji));
        bw.write(String.format("city %s", p[0].location));
        bw.flush();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

class Person {
    String name;
    int tall;
    double weight;
    
    public Person() {
        this.name = "";
        this.tall = 0;
        this.weight = 0.0;
    }

    public Person(String name, int tall, double weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }
}

// 이름 순으로 정렬 (오름차순)
class SortPersonName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

// 키 순으로 정렬 (내림차순)
class SortPersonTall implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.tall - o1.tall;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Person> personList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<5; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            
            String name = st.nextToken();
            int tall = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            personList.add(new Person(name, tall, weight));
        }


        // logic //
        // 키 순으로 출력
        Collections.sort(personList, new SortPersonName());
        bw.write("name\n");
        for(int i=0; i<personList.size(); i++) {
            bw.write(String.format("%s %d %.1f\n", personList.get(i).name, personList.get(i).tall, personList.get(i).weight));
        }
        bw.write("\n");


        Collections.sort(personList, new SortPersonTall());
        bw.write("height\n");
        for(int i=0; i<personList.size(); i++) {
            bw.write(String.format("%s %d %.1f\n", personList.get(i).name, personList.get(i).tall, personList.get(i).weight));
        }

        // output //
        bw.flush();
        bw.close();
    }
}
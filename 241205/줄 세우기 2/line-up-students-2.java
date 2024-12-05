import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
    int stdNum;
    int height;
    int weight;

    public Student() {
        this.stdNum = 0;
        this.height = 0;
        this.weight = 0;
    }

    public Student(int stdNum, int height, int weight) {
        this.stdNum = stdNum;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        if(this.height != other.height) return this.height - other.height; // 키 오름차순 정렬
        else return other.weight - this.weight; // 몸무게 내림차순 정렬
    }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Student[] student = new Student[N];

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            student[i] = new Student(i+1, height, weight);
        }

        Arrays.sort(student);

        for(int i=0; i<N; i++) {
            bw.write(String.format("%d %d %d\n", student[i].height, student[i].weight, student[i].stdNum));
        }
        bw.flush();
        bw.close();
    }
}
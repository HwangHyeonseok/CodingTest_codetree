import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int stdNum;

    public Student() {
        height = 0;
        weight = 0;
        stdNum = 0;
    }

    public Student(int height, int weight, int stdNum) {
        this.height = height;
        this.weight = weight;
        this.stdNum = stdNum;
    }

    @Override
    public int compareTo(Student other) {
        if(this.height != other.height) return other.height - this.height; // 키 내림차순
        else if(this.weight != other.weight) return other.weight - this.weight; // 몸무게 내림차순
        else return this.stdNum - other.stdNum; // 번호 내림차순
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
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            student[i] = new Student(h, w, i+1);
        }

        Arrays.sort(student);

        for(int i=0; i<student.length; i++) {
            bw.write(String.format("%d %d %d\n", student[i].height, student[i].weight, student[i].stdNum));
        }

        bw.flush();
        bw.close();
    }
}
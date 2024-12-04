import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
  String name;
  int korean;
  int eng;
  int math;

  public Student() {
    this.name = "";
    this.korean = 0;
    this.eng = 0;
    this.math = 0;
  }
  public Student(String name, int korean, int eng, int math) {
    this.name = name;
    this.korean = korean;
    this.eng = eng;
    this.math = math;
  }
  @Override
  public int compareTo(Student other) {
    if(this.korean != other.korean) return other.korean - this.korean; // 국어
    else if(this.eng != other.eng) return other.eng - this.eng; // 영어
    else return other.math - this.math; // 수학
  }
};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Student[] student = new Student[n];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            student[i] = new Student(name, korean, eng, math);
        }

        // 정렬 (오름차순)
        Arrays.sort(student);
        // 모두 출력
        for(int i=0; i<student.length; i++) {
            bw.write(String.format("%s %d %d %d\n", student[i].name, student[i].korean, student[i].eng, student[i].math));
        }
        bw.flush();
        bw.close();
    }
}
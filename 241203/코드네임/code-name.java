import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
   String codeName;
   Integer score;
   
   public Student() {
    this.codeName = "";
    this.score = 0;
   }

   public Student(String codeName, Integer score) {
    this.codeName = codeName;
    this.score = score;
   }

    // 정렬
   @Override
   public int compareTo(Student other) {
    return Integer.compare(this.score, other.score);// 오름차순 정렬 (this가 앞에 옴.)
   }
};


public class Main {
    static final int N = 5;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Student[] student = new Student[N];
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String codeName = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            student[i] = new Student(codeName, score);
        }

        // 정렬
        Arrays.sort(student);

        // 점수가 가장 낮은 요원의 코드네임과 점수 출력
        bw.write(String.format("%s %d", student[0].codeName, student[0].score));
        bw.flush();
        bw.close();
    }
}
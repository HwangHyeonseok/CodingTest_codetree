import java.util.*;
import java.io.*;

class Student {
    String name;
    int kor;
    int eng;
    int math;
    
    public Student() { this.name = ""; this.kor = 0; this.eng = 0; this.math = 0;}
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

// 국어, 영어, 수학 내림차순 정렬
class SortStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.kor != o2.kor) return o2.kor - o1.kor;
        else if(o1.eng != o2.eng) return o2.eng - o1.eng;
        else return o2.math - o1.math;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Student> studentList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            
            studentList.add(new Student(name, kor, eng, math));
        }

        // logic // 
        Collections.sort(studentList, new SortStudent());
        
        // output //
        for(int i=0; i<studentList.size(); i++) {
            bw.write(String.format("%s %d %d %d\n", studentList.get(i).name, studentList.get(i).kor, studentList.get(i).eng, studentList.get(i).math));
        }
        bw.flush();
        bw.close();
    }
}
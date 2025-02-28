// Call by Value를 통해 객체의 주소를 공유하여 그 주소에 있는 변수의 값을 수정하면 값을 변경할 수 있다.
import java.util.*;
import java.io.*;

class Number {
    int val;
    
    public Number() {}
    public Number(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // logic // 
        Number nObj = new Number(n);
        Number mObj = new Number(m);
        swap(nObj, mObj);
        // output //
        bw.write(String.format("%d %d", nObj.val, mObj.val));
        bw.flush();
        bw.close();
    }

    public static void swap(Number nObj, Number mObj) {
        int temp = nObj.val;
        nObj.val = mObj.val;
        mObj.val = temp;
    }
}



// JAVA는 일반적인 경우 Call by Value로 값을 전달한다.
// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         String input = br.readLine();
//         StringTokenizer st = new StringTokenizer(input, " ");

//         // logic // 
//         Integer n = Integer.parseInt(st.nextToken());
//         Integer m = Integer.parseInt(st.nextToken());
//         swap(n,m);
//         // output //
//         bw.write(String.format("%d %d", n, m));
//         bw.flush();
//         bw.close();
//     }

//     public static void swap(Integer a, Integer b) {
//         Integer temp = a;
//         a = b;
//         b = temp;
//     }
// }
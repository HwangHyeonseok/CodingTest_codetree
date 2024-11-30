import java.util.*;
import java.io.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        IntWrapper n = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper m = new IntWrapper(Integer.parseInt(st.nextToken()));

        swap(n,m);
        bw.write(n.value + " " + m.value);
        bw.flush();
        bw.close();
    }

    static void swap(IntWrapper n, IntWrapper m) {
        int temp;
        temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
}
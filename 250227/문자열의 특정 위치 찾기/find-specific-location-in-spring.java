import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        String str = st.nextToken();
        String find = st.nextToken();

        // logic // 
        if(str.indexOf(find) == -1) {
            bw.write("No");
        }
        else {
            bw.write(str.indexOf(find)+"");
        }
        
        // output //
        bw.flush();
        bw.close();
    }
}
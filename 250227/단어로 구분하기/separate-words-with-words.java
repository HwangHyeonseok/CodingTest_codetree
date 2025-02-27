import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<String> strArr = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();

        // logic //
        String str = "";
        for(int i=0; i<input1.length(); i++) {
            if(input1.charAt(i) == ' ') {
                strArr.add(str);
                str="";
            }
            else {
                str += input1.charAt(i);
            }
        }
        // 마지막 문자 처리
        if(str != "") strArr.add(str);

        // output //
        for(int i=0; i<strArr.size(); i++) {
            bw.write(strArr.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
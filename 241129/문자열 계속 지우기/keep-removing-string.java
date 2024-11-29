import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String findWord = br.readLine();

        // baaabcabc index : 3 index+length()

        // abc

        while(true) {
            if(input.indexOf(findWord) == -1) { // 더 이상 같은 것이 없음.
                break;
            }
            else {
                int index = input.indexOf(findWord); // 그 단어가 있는 인덱스 찾기
                int len = findWord.length();
                input = input.substring(0,index) + input.substring(index+len);
            }
        }

        bw.write(input);
        bw.flush();
        bw.close();
    }
}
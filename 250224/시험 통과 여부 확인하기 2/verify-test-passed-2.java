import java.util.*;
import java.io.*;

public class Main {
    static int[][] studentScore = new int[10][4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int stuCnt = Integer.parseInt(br.readLine());
        
        String input = "";
        for(int r=0; r<stuCnt; r++) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            for(int c=0; c<4; c++) {
                studentScore[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        // logic//
        int passCnt = 0; // 통과한 학생 수
        for(int student=0; student<stuCnt; student++) {
            // 1) 학생마다 평균이 60점 이상이면 pass 출력, 아니면 fail 출력
            int scoreSum = 0;
            for(int subjectCnt=0; subjectCnt<4; subjectCnt++) {
                scoreSum += studentScore[student][subjectCnt];
            }
            if(scoreSum / 4 >= 60) {
                bw.write("pass\n");
                passCnt++;
            }
            else bw.write("fail\n");
        }
        bw.write(passCnt+"");
        bw.flush();
        bw.close();
    }
}
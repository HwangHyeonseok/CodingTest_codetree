import java.util.*;
import java.io.*;

class Info {
    int num;
    int prevIndex;
    int afterIndex;

    Info(int num, int prevIndex) {
        this.num = num;
        this.prevIndex = prevIndex;
        this.afterIndex = 0;
    }
}

// num 을 기준으로 오름차순 정렬 (동일 원소인 경우 먼저 입력으로 주어진 것이 앞으로 온다.)
class SortNum implements Comparator<Info> {
    @Override
    public int compare(Info o1, Info o2) {
        if(o1.num == o2.num) return o1.prevIndex - o2.prevIndex;
        return o1.num - o2.num;
    }
}

// prevIndex 기준 정렬
class SortPrevIndex implements Comparator<Info> {
    @Override
    public int compare(Info o1, Info o2) {
        return o1.prevIndex - o2.prevIndex;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Info> numList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i=0; i<n; i++) {
            numList.add(new Info(Integer.parseInt(st.nextToken()), i+1));
        }

        // logic // 
        // 1) num 을 기준으로 정렬
        Collections.sort(numList, new SortNum());

        // 2) afterIndex 수정
        for(int i=0; i<numList.size(); i++) {
            numList.get(i).afterIndex = i+1;
        }

        // 3) prevIndex 기준 정렬
        Collections.sort(numList, new SortPrevIndex());


        // 4) afterIndex 출력
        for(int i=0; i<numList.size(); i++) {
            bw.write(String.format("%d ", numList.get(i).afterIndex));
        }


        // test //
        // for(int i=0; i<numList.size(); i++) {
        //     bw.write(String.format("%d %d %d\n", numList.get(i).num, numList.get(i).prevIndex, numList.get(i).afterIndex));
        // }
        
        // output //
        bw.flush();
        bw.close();
    }
}
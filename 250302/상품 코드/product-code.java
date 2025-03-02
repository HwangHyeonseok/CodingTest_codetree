import java.util.*;
import java.io.*;

class Product {
    String title;
    String code;
    
    public Product() {
        this.title = "";
        this.code = "";
    }

    public Product(String title, String code) {
        this.title = title;
        this.code = code;
    }
};

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        
        String t = st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        // logic // 
        Product p1 = new Product("codetree", 50);
        Product p2 = new Product(t, c);
        
        // output //
        bw.write(String.format("product %d is %s\n", p1.title, p1.code));
        bw.write(String.format("product %d is %s\n", p2.title, p2.code));
        bw.flush();
        bw.close();
    }
}
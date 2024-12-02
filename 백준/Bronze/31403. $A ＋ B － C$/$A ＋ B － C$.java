import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int C = Integer.parseInt(br.readLine());
        
        int i = Integer.parseInt(A) + Integer.parseInt(B) - C;
        System.out.println(i);
        int s = Integer.parseInt(A + B) - C;
        System.out.println(s);
    }
}

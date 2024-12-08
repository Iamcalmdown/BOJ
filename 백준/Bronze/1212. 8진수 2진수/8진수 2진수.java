import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.parseInt(eight[str.charAt(0) - '0']));
        
        for (int i = 1; i < str.length(); i++) {
            sb.append(eight[str.charAt(i) - '0']);
        }
        System.out.println(sb);
    }
}

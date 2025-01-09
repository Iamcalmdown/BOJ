import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (str.contains("XX")) {
            if (str.contains("XXXX")) {
                str = str.replace("XXXX", "AAAA");
            } else {
                str = str.replace("XX", "BB");
            }
        }
        if (str.contains("X")) {
            System.out.println(-1);
            return;
        }
        System.out.println(str);
    }
}

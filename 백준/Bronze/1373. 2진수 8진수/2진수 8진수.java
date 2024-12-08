import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        if (str.length() % 3 == 1) {
            str = "00" + str;
        } else if (str.length() % 3 == 2) {
            str = "0" + str;
        }

        for (int i = 0; i < str.length(); i += 3)
            sb.append(Integer.parseInt(str.substring(i, i + 3), 2));
        System.out.println(sb);
    }
}

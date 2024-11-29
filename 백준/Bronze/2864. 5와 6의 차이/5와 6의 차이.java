import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String as = st.nextToken();
        String bs = st.nextToken();

        as = as.replace('6', '5');
        bs = bs.replace('6', '5');
        System.out.print(Integer.parseInt(as) + Integer.parseInt(bs));
        System.out.print(" ");

        as = as.replace('5', '6');
        bs = bs.replace('5', '6');
        System.out.print(Integer.parseInt(as) + Integer.parseInt(bs));
    }
}

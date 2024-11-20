import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int a = 0, b = 0;
    while (true) {
      st = new StringTokenizer(br.readLine());
      if ((a = Integer.parseInt(st.nextToken())) != 0) {
        b = Integer.parseInt(st.nextToken());
        if (b % a == 0)
          System.out.println("factor");
        else if (a % b == 0)
          System.out.println("multiple");
        else
          System.out.println("neither");
      } else
        break;
    }
  }
}

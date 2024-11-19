import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());

    for (int i = 0; i < T; i++) {
      int num = Integer.parseInt(br.readLine());
      int Q = num / 25;
      num = (num % 25);
      int D = num / 10;
      num = (num % 10);
      int N = num / 5;
      num = (num % 5);
      int P = num / 1;

      sb.append(Q + " " + D + " " + N + " " + P + "\n");
    }
    System.out.println(sb.toString());
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = n;
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (a == 1) {
        cnt--;
        continue;

      } else {
        for (int k = 2; k < a; k++) {
          if (a % k == 0) {
            cnt--;
            break;
          }
        }
      }
    }
    System.out.println(cnt);
  }

}

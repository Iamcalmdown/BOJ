import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "p" };
    double ar = 0, sum = 0;
    double cnt = 0;
    for (int tc = 0; tc < 20; tc++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String clna = st.nextToken();// 걍끝

      double sc = Double.parseDouble(st.nextToken()); // 이수학점
      String gr = st.nextToken(); // 성적

      for (int i = 0; i < arr.length; i++) {
        if (!arr[i].equals("F"))
          ar = 4.5 - 0.5 * i;
        else
          ar = 0;
        if ((gr.equals(arr[i])) && (!arr[i].equals("p"))) {
          sum += (sc * ar);
          cnt += sc;
        } else
          continue;
      }

    }
    System.out.printf("%f", sum / cnt);
  }
}

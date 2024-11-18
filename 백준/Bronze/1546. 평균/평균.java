import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 3개 갯수

    StringTokenizer st;
    st = new StringTokenizer(br.readLine());

    double max = -1;
    double[] sc = new double[T];

    for (int i = 0; i < sc.length; i++) {
      sc[i] = Double.parseDouble(st.nextToken());
      if (max < sc[i]) {
        max = sc[i];
      }
    } // 까지하면 최고값이 max 가된다.
    double avg = 0;
    for (int i = 0; i < sc.length; i++) {
      avg += (sc[i] / max) * 100;
    }
    System.out.printf("%f", avg / T);
  }
}

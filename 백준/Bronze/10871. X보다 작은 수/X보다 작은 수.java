import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    st = new StringTokenizer(br.readLine()); // 첫째줄
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());
    int res;

    st = new StringTokenizer(br.readLine()); // 둘째줄
    for (int i = 0; i < N; i++) {
      res = Integer.parseInt(st.nextToken());
      if (res < X)
        sb.append(res).append(" ");
    }
    System.out.print(sb.toString());
  }
}
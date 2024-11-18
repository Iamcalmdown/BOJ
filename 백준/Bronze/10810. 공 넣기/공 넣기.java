import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine(); // 5랑 4가지고옴
    StringTokenizer st = new StringTokenizer(line);
    int N = Integer.parseInt(st.nextToken()); // N == 5
    int M = Integer.parseInt(st.nextToken()); // M == 4
    int[] baguni = new int[N];

    for (int i = 0; i < M; i++) {
      StringTokenizer stz = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(stz.nextToken()) - 1;
      int b = Integer.parseInt(stz.nextToken()) - 1;
      int c = Integer.parseInt(stz.nextToken());
      for (int k = a; k <= b; k++)
        baguni[k] = c;
    }
    for (int i = 0; i < N; i++) {
      System.out.print(baguni[i] + " ");
    }
    br.close();
  }
}

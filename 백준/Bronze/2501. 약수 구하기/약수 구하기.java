import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];

    int index = 0;
    for (int i = 0; i < N; i++) {
      if (N % (i + 1) == 0) {
        arr[index] = i + 1;
        index++;
      }
    }
    System.out.println(arr[K - 1]);
  }
}

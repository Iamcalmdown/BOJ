import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    int a = 2;
    for (int i = 0; i < T; i++) {
      sb.append(1);
    }
    int X = Integer.parseInt(sb.toString(), 2) + a;
    System.out.println(X * X);
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int sum = 0;
    for (int t = T; t > 0; t--) {
    sum += t;
    }
    System.out.println(sum);
  }
}
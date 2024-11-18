import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    if (A == B && A == C) {
      System.out.println(10000 + 1000 * A);
    } else if (A == B && A != C) {
      System.out.println(1000 + A * 100);
    } else if (B == C && B != A) {
      System.out.println(1000 + B * 100);
    } else if (C == A && C != B) {
      System.out.println(1000 + C * 100);
    } else {
      if (A > B && A > C) {
        System.out.println(A * 100);
      } else if (B > C && B > A)
        System.out.println(B * 100);
      else
        System.out.println(C * 100);
    }
  }
}
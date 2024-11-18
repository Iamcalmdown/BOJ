import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++)
        System.out.print(" ");
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < N - 1; i++) {
      for (int j = N - 1 - i; j < N; j++)
        System.out.print(" ");
      for (int k = 0; k < 2 * (N - i) - 3; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
} 
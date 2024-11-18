import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inp = br.readLine().split("");
    String[] al = { "0", "0", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
    int sum = 0;

    for (int i = 0; i < inp.length; i++) {
      for (int j = 0; j < al.length; j++) {
        if (al[j].contains(inp[i])) {
          sum += (j + 1);
          break;
        }
      }
    }
    System.out.println(sum);
  }
}
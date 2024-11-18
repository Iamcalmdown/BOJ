import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String[] cro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    int sum = 0;
    int i = 0;
    while (i < cro.length) {
      if (s.contains(cro[i])) {
        s = s.replaceFirst(cro[i], " ");
        sum++;
      } else {
        i++;
      }

    }
    s = s.replace(" ", "");
    System.out.println(sum += s.length());
  }
}

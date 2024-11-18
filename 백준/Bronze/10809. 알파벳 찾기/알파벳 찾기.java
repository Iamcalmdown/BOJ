import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] re = new int[26];
    for (int i = 0; i < re.length; i++) {
      re[i] = -1;
    }
    String s = br.readLine();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (re[c - 'a'] == -1)
        re[c - 'a'] = i;
    }
    for (int i : re) {
      System.out.print(i + " ");
    }
  }
}

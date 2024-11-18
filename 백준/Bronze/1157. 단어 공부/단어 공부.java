import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();
    int[] al = new int[26]; // 알파벳의 빈도수를 저장
    Arrays.fill(al, 0);

    for (int i = 0; i < str.length(); i++) {
      al[str.charAt(i) - 'A']++;
    }
    int max = 0;
    int idx = 0;
    Boolean b = false;
    for (int k = 0; k < al.length; k++) {
      if (max < al[k]) {
        max = al[k];
        idx = k;
        b = false;
      } else if (max == al[k]) {
        b = true;
      }

    }
    if (b != true)
      System.out.printf("%c", idx + 'A');
    else
      System.out.println("?");
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] nine = new int[9][9];
    StringTokenizer st;
    int h = 0, y = 0;

    for (int i = 0; i < nine.length; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < nine[i].length; j++) {
        nine[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    int b = -1;
    for (int i = 0; i < nine.length; i++) {
      for (int k = 0; k < nine[i].length; k++) {
        if (b < nine[i][k]) {
          b = nine[i][k];
          h = i;
          y = k;
        }
      }
    }
    System.out.println(b);
    System.out.println((h + 1) + " " + (y + 1));
  }
}

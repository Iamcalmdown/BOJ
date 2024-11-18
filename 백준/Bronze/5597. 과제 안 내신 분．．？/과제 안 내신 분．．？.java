import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] stunum = new int[30];

    for (int i = 0; i < 28; i++) {
      int num = Integer.parseInt(br.readLine());
      stunum[num - 1] = 1;
    }
    for (int k = 0; k < 30; k++) {
      if (stunum[k] != 1) {
        System.out.println(k+1);
      }
    }
    br.close();
  }
}
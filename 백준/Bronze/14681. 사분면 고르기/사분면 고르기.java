import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int sa = 0;
    if (x > 0 && y > 0)
      sa = 1;
    else if (x < 0 && y > 0)
      sa = 2;
    else if (x < 0 && y < 0)
      sa = 3;
    else
      sa = 4;
    System.out.println(sa);
  }
}
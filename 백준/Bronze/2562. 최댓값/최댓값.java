import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s; // 처음 가져오는 문자열을 저장하는 변수
    int max = -1; // 최대값을 구하기 위한 최소 숫자를 집어넣어서 비교한다.
    int idx = 0, cnt = 0; // 인덱스 값을 구하기 위한 cnt와
    while ((s = br.readLine()) != null) {
      idx++;
      if (max < Integer.parseInt(s)) {
        max = Integer.parseInt(s);
        cnt = idx;
      }
    }
    System.out.println(max);
    System.out.println(cnt);
  }
}
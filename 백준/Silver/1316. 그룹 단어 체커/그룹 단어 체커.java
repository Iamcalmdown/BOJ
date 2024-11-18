import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    int cnt = 0;
    for (int i = 0; i < T; i++) {
      if (checkStr(br.readLine())) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }

  public static Boolean checkStr(String str) {
    boolean[] b = new boolean[26]; // 그룹 문자 판별 알파벳 불리언 배열

    int prev = -1; // 이전 문자의 인덱스를 저장.
    for (int i = 0; i < str.length(); i++) {
      int now = str.charAt(i);
      if (prev != now) {
        if (b[str.charAt(i) - 'a'] != true) {
          b[str.charAt(i) - 'a'] = true;
          prev = now;
        } else {
          return false; // 이미 나왔으니 false로 마감.
        }

      } else
        continue;
    }
    return true;
  }
}
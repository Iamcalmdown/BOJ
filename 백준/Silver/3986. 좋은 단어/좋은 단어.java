import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N-- > 0) {
            if (isGoodWord(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isGoodWord(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}

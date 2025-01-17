import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pipe = br.readLine();
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < pipe.length(); i++) {
            if (pipe.charAt(i) == '(') {
                stack.push(pipe.charAt(i));
            } else {
                if (pipe.charAt(i - 1) == '(') {
                    stack.pop();
                    cnt += stack.size();
                } else {
                    stack.pop();
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

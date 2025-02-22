import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            sb.append(solve(str)).append("\n");
        }
        System.out.print(sb);
    }

    public static String solve(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            char c = s.charAt(i);
//
//            if (c == '(' || c == '[') {
//                stack.push(c);
//            } else if (c == ')') {
//                if (stack.empty() || stack.peek() != '(') {
//                    return "no";
//                } else {
//                    stack.pop();
//                }
//            } else if (c == ']') {
//                if (stack.empty() || stack.peek() != '[') {
//                    return "no";
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//        if (stack.empty()) {
//            return "yes";
//        } else {
//            return "no";
//        }
        int[] stack = new int[s.length()];
        int size = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack[size] = c;
                size++;
            } else if (c == ')') {
                if (size == 0 || stack[size - 1] != '(') {
                    return "no";
                } else {
                    size--;
                }
            } else if (c == ']') {
                if (size == 0 || stack[size - 1] != '[') {
                    return "no";
                } else {
                    size--;
                }
            }
        }
        if (size == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}

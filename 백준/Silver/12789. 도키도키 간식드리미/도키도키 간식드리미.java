import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 현재 줄 선 사람들 번호표
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());// 현재 줄 선 사람들 번호표
        }
        System.out.println(solve(arr));
    }
    public static String solve(int[] def) {
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        for (int i = 0; i < def.length; i++) {
            if (num == def[i]) {
                num++;
            } else {
                while (!stack.empty() && stack.peek() == num) {
                    stack.pop();
                    num++;
                }
                stack.push(def[i]);
            }
        }
        while (!stack.empty() && stack.peek() == num) {
            stack.pop();
            num++;
        }
        if (stack.empty()) {
            return "Nice";
        } else {
            return "Sad";
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                int arrnum = arr[str.charAt(i) - 'A'];
                stack.push((double) arrnum);
            } else {
                double a = stack.pop();
                double b = stack.pop();
                switch (str.charAt(i)) {
                    case '*':
                        stack.push(b * a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}

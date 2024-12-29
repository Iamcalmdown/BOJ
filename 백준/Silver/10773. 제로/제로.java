import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        stack = new int[K];

        int sum = 0;
        while (K-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                sum -= pop();
            } else {
                sum += push(n);
            }
        }
        System.out.println(sum);
    }

    public static int push(int item) {
        stack[size] = item;
        size++;
        return item;
    }

    public static int pop() {
        int res = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return res;
    }
}

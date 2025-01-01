import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 현재 줄 선 사람들 번호표
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());// 현재 줄 선 사람들 번호표
        }
        System.out.println(solve(arr));
    }

    public static String solve(int[] def) {
        int[] stack = new int[N];
        int num = 1, size = 0; // 처음에 비교해서 출력할 번호 표 값과 스택의 크기

        for (int i = 0; i < def.length; i++) {
            if (num == def[i]) {
                num++;
            } else {
                while (size != 0 && stack[size - 1] == num) {
                    num++;
                    size--;
                }
                stack[size] = def[i];
                size++;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (num == stack[i]) {
                num++;
            }
        }
        if (num - 1 == N) {
            return "Nice";
        } else {
            return "Sad";
        }
    }
}

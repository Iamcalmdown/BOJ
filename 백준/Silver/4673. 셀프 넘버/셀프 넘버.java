public class Main {
    public static boolean[] num = new boolean[10000];

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10000; i++) {
            cal(i);
        }
        for (int i = 1; i < 10000; i++) {
            if (!num[i])
                sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

    public static void cal(int a) {
        int sum = a;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        if (sum < 10000)
            num[sum] = true;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double sum = 0;

        int[] arr = new int[8001];
        int most = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
            sum += a;
            arr[a + 4000]++;
            most = Math.max(most, arr[a + 4000]);
        }
        Collections.sort(list);

        ArrayList<Integer> mode = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == most) {
                mode.add(i - 4000);
            }
        }
        System.out.println(Math.round(sum / N)); // 산술평균
        System.out.println(list.get((N - 1) / 2)); // 중앙값
        System.out.println((mode.size() > 1) ? mode.get(1) : mode.get(0));
        System.out.println(list.get(N - 1) - list.get(0)); // 범위
    }
}

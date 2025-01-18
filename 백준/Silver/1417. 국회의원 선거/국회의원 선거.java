import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (N-- > 1) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            dasom++;
            int tmp = pq.poll();
            pq.add(--tmp);
            cnt++;
        }
        System.out.println(cnt);
    }
}

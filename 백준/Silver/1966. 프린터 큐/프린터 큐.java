import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int cnt = 0;

            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean max = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (first[1] < queue.get(i)[1]) {
                        queue.add(first);

                        for (int j = 0; j < i; j++) {
                            queue.add(queue.poll());
                        }
                        max = false;
                        break;
                    }
                }

                if (!max) {
                    continue;
                }
                cnt++;
                if (first[0] == M)
                    break;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}

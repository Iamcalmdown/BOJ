import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] size = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int shirt = Integer.parseInt(st1.nextToken());
        int pen = Integer.parseInt(st1.nextToken());
        int t = 0;

        for (int i = 0; i < size.length; i++) {
            size[i] = Integer.parseInt(st.nextToken());
            if (size[i] % shirt == 0) {
                t += size[i] / shirt;
            } else {
                t += size[i] / shirt + 1;
            }
        }
        System.out.println(t);
        System.out.println(N / pen + " " + N % pen);
    }
}

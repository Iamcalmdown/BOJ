import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String res = "";
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] + 1 == arr[j + 1])
                res = "ascending";
            else if (arr[j] - 1 == arr[j + 1])
                res = "descending";
            else {
                res = "mixed";
                break;
            }
        }
        System.out.println(res);
    }
}

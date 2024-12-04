import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] sam = new int[3];
            sam[0] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
            sam[1] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
            sam[2] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);

            Arrays.sort(sam);
            if (sam[0] == 0)
                break;

            if (sam[0] + sam[1] == sam[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}

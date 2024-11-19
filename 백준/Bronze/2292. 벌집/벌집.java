import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int room = 1, range = 2;
        int N = Integer.parseInt(br.readLine());
        if (N == 1)
            System.out.println(room);
        else {
            while (N >= range) {
                range = range + 6 * room;
                room++;
            }
            System.out.println(room);
        }
    }
}

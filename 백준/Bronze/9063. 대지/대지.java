import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int minx = 10001;
        int miny = 10001;
        int maxx = -10001;
        int maxy = -10001;

        for(int i=0; i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (minx > x)
                minx = x;
            if (miny > y)
                miny = y;
            if( maxx< x)
                maxx = x;
            if(maxy < y)
                maxy = y;
        }
        System.out.println((maxx-minx)*(maxy-miny));
    }
}

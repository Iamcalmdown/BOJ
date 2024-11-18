import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = 0, y = 0; // 결과값
        int [] arr = new int[6];
        for(int i=0; i<6; i+=2){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i+1] = Integer.parseInt(st.nextToken());
        }

        if(arr[0]==arr[2])
            x = arr[4];
        else if(arr[0]==arr[4])
            x = arr[2];
        else
            x = arr[0];
        if(arr[1]==arr[3])
            y = arr[5];
        else if(arr[1]==arr[5])
            y = arr[3];
        else
            y = arr[1];
        System.out.println(x + " " + y);

    }
}

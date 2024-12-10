import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static int cal(int strow, int stcol, String[] line) {
        int white = 0; // 블랙과 비교했을 때 다른 횟수를 세면 그게 화이트 체스판의 수가 된다.
        String[] right = {"BWBWBWBW", "WBWBWBWB"}; // 블랙이 가장 먼저 나오는 체스판
        for (int i = 0; i < 8; i++) {
            int row = strow + i; // 8개짜리 체스판을 반복해서 사용하지만 시작 행의 번호를 더해서 계산한다. line은 전체 행과 열을 다룬다.
            for (int j = 0; j < 8; j++) {
                int col = stcol + j; // 8개짜리 체스판을 반복해서 사용하지만 시작 열의 번호를 더해서 계산한다. line은 전체 행과 열을 다룬다.
                if (line[row].charAt(col) != right[row % 2].charAt(j)) { // 시작행 문자열 배열의 시작 열 문자부터 비교해서 일치하지 않으면 이것을 화이트 체스판으로 본다.
                    white++; //화이트 체스판의 수를 늘린다.
                }
            }
        }
        return Math.min(white, 64 - white);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행과
        int M = Integer.parseInt(st.nextToken()); // 열이다,

        String[] line = new String[N]; // 체스판의 행을 가지고 있는 문자열 배열
        for (int i = 0; i < N; i++) {
            line[i] = br.readLine();
        } // 체스판 전체의 내용을 가지고 있다.
        int min = Integer.MAX_VALUE; // 비교를 위한 최댓값
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int res = cal(i, j, line); // 계산을 하기위해 값을 넘겨서 최소값을 받아와서 비교한다.
                if (min > res) {
                    min = res;
                }
            }
        }
        System.out.println(min);
    }
}
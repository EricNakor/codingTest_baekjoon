import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

        // 첫번째 줄 배열 크기 읽기
        int N = Integer.parseInt(br.readLine());

        // N 크기 정수 배열
        int[] arr = new int[N];

        // 두번째 줄 배열 요소 읽기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        // 스트링 토크나이저로 각 토큰 정수로 인식
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        // 세번째 줄 찾을 정수 v
        int v = Integer.parseInt(br.readLine());

        // 찾은 v의 갯수
        int countV = 0;

        // 배열 읽고, v랑 같으면 카운트
        for (int i : arr) {
            if (i == v) {
                countV++;
            }
        }

        // 찾은 v 출력
        bw.write(Integer.toString(countV));
        bw.flush();
        br.close();
        bw.close();
    }
}
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

        boolean[] arr = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n - 1] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                bw.write((i + 1) + "\n");
                bw.flush();
            }
        }

        br.close();
        bw.close();
    }
}
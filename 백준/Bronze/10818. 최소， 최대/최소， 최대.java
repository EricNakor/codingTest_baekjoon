import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }

        int min = Collections.min(arrList);
        int max = Collections.max(arrList);
        bw.write(min + " " + max);

        bw.flush();
        br.close();
        bw.close();
    }
}
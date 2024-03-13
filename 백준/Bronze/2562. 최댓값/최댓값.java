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
        int maxNumber = Integer.MIN_VALUE;
        int cnt=0;
        int[] iArr = new int[9];
        for(int i=0;i<iArr.length;i++) {
            iArr[i] = Integer.parseInt(br.readLine());
            if(maxNumber < iArr[i]) {
                maxNumber = iArr[i];
                cnt = i+1;
            }
        }
        bw.write(maxNumber+"\n");
        bw.write(cnt+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
package step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step03 {

    // No.2739
    public void multiplicationTable(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s * %s = %s%n", a, i, (a * i));
        }

    }

    // No.10950
    public void loofPlus(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T =  Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int answer = 0;

            while (st.hasMoreTokens()) {
                answer += Integer.parseInt(st.nextToken());
            }

            System.out.println(answer);
        }
    }

    // No.25314
    public void repeatLong(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("long ".repeat(Math.max(0, N / 4)));
        sb.append("int");

        System.out.println(sb);
    }

    // No.15552
    public void no15552() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T, result;
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            result = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                result += Integer.parseInt(st.nextToken());
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}

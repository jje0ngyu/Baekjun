package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step04 {

    // No.10807 A
    public static void arrayA(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemCnt = sc.nextLine();
        String inputItems = sc.nextLine();
        String findItem = sc.nextLine();

        int answer = 0;
        StringTokenizer st = new StringTokenizer(inputItems);
        while(st.hasMoreTokens()) {
            answer += findItem.equals(st.nextToken()) ? 1 : 0;
        }

        System.out.println(answer);
    }

    // No.10807 B
    public static void arrayB(String[] args) throws  IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] SplitNums = br.readLine().split(" ");
        String v = br.readLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (SplitNums[i].equals(v)) cnt++;
        }
        System.out.print(cnt);
    }
}

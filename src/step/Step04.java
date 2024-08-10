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

    // No.25304
    public static void shopping(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X =  Integer.parseInt(br.readLine());   // 구매 합계
        int N =  Integer.parseInt(br.readLine());   // 구매한 물건의 종류의 수 (반복 기준)


        int total = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken()); // 금액
            int cnt  = Integer.parseInt(st.nextToken()); // 수량

            total += cost * cnt;

        }

        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // No.10871 - Time:416ms
    public static void getSmallerX(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        int N =  Integer.parseInt(sArr[0]);
        int X =  Integer.parseInt(sArr[1]);
        String[] sNums = br.readLine().split(" ");
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(sNums[i]) < X)   buffer.append(String.format(" %s",sNums[i]));
        }

        System.out.println(buffer.substring(1));
    }
}

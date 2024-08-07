package step;

import java.util.Scanner;
import java.util.StringTokenizer;

public class STEP01 {
    public void s1000() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }

    // 조건 1 : 1 ≤ A, B, C ≤ 1012
    // int 사용시 NumberFormatException 발생
    // -> Integer.parseInt를 사용할 경우 2^31 -1보다 크면 Integer의 범위를 벗어나기 때문에 발생
    public void no11382() {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);

        Long answer = 0L;
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            answer += Long.parseLong(token);
        }

        System.out.println(answer);

    }
}

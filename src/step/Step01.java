package step;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step01 {
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

    /* No. 10171
        \    /\
         )  ( ')
        (  /  )
         \(__)|
    */
    public static void drowCat(String[] args) {

        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    /*
        |\_/|
        |q p|   /}
        ( 0 )"""\
        |"^"`    |
        ||_/=\\__|
    */
    public static void drowDog(String[] args) {

        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

    }

    // No.2588
    public static void no2588() {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int tempB = b;
        int powerOfTen = 1;

        // b의 각 자리수를 이용해 a와 곱셈을 수행
        while (tempB > 0) {
            int numB = tempB % 10; // b의 각 자리수 추출
            tempB /= 10; // 다음 자리수로 이동

            int res = a * numB * powerOfTen;
            arr.add(res);

            powerOfTen *= 10; // 자리수 증가
        }

        int total = 0;
        for (int item : arr) {
            total += item;
        }

        // 개별 곱셈 결과 출력
        int digit = 1;
        for (int item : arr) {
            System.out.println(item / digit) ;
            digit = digit * 10;
        }

        // 최종 합계 출력
        System.out.println(total);
    }
}

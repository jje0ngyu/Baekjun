package step;

import java.util.Scanner;

public class Step03 {

    // No.2739
    public static void multiplicationTable(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s * %s = %s%n", a, i, (a * i));
        }

    }
}

package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Step02 {

    /*
    * BufferedReader 와 Scanner 의 차이
    * StringTokenizer 란?
    * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)
    * StringTokenizer st = new StringTokenizer(br.readLine());
    * */
    public void s1330() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
    }

    // No.2753
    public static void checkLeapYear(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if ((n % 4 == 0 && n % 100 != 0)
                || n % 400 == 0 ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

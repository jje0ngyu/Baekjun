package step;

import java.util.Scanner;

public class STEP02 {

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
}

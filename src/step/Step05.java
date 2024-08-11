package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String 문자열
public class Step05 {

    // No.27866
    public static void getCharacter(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine()) -1;

        System.out.println(str.charAt(idx));
    }
}

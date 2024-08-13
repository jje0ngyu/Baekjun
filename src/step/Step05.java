package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String 문자열
public class Step05 {

    // No.27866
    public void getCharacter(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine()) -1;

        System.out.println(str.charAt(idx));
    }

    // No.9086
    public void getFirstLastChar(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(String.format("%s%s",str.charAt(0),str.charAt(str.length() - 1)));
        }
    }
}

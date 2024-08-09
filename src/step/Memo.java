package step;

import java.util.StringTokenizer;

public class Memo {
    /* ***********************************************
    StringTokenizer

    - delim 에 포함된 알파벳을 기준으로 전달받은 String 을 분할한 것을 token 이라고 한다.
    - countTokens() 을 통해 분할된 토큰의 개수를 구할 수 있고
    - hasMoreTokens() 을 통해 분할된 토큰을 while 문을 사용해 순차적으로 가져올 수 있다.
    - nextToken() 을 통해 토큰을 순차적으로 하나씩 불러온다.
    - nextToken(String str) 을 통해 토큰을 쪼갤 수 있다.
    - StringTokenizer() 의 delim 과 nextToken() 의 delim 이 만나면 nextToken() 의 delim 기준으로 hasMoreTokens() 이 적용된다.
    *********************************************** */
    public static void stringTokenizer(String[] args) {

        String str = "test tokenizer space rabbit";
        StringTokenizer st = new StringTokenizer(str, "ai");
        System.out.println("st = " + st.countTokens());
        int i = 0;
        while(st.hasMoreTokens()) {
            i++;
            System.out.println("st " + i + " = " + st.nextToken("t"));
        }

    }
}

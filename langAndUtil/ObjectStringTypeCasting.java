package langAndUtil;

/*
parseInt(), parseFloat()같은 메서드는 문자열에 공백 또는 문자가 포함되어 있는 경우 변환 시 예외가 발생할 수 있으므로 주의해야 한다.
그래서 문자열 양끝의 공백을 제거해주는 trim()을 습관적으로 같이 사용하기도 한다.
int val = Integer.parseInt(" 123 ".trim());  -> 문자열 양 끝의 공백을 제거 후 반환
*/

public class ObjectStringTypeCasting {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int를 String으로 변환한다.

        double dVal = 200.0;
        String strVal2 = dVal + ""; // String으로 변환하는 또 다른 방법

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        // 부호를 의미하는 '+'나 소수점을 의미하는 '.'와 float형 값을 뜻하는 f와 같은 자료형 접미사는 허용된다.
        // 단, 자료형에 알맞은 변환을 하는 경우에만 허용된다.
        // 만일 '1.0f'를 int형 변환 메서드은 Integet.parseInt(String s)를 사용해서 변환하려하면 예외가 발생하지만,
        // Float.parseFloat(String s)를 사용하면 아무런 문제가 없다.

        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);

    }
}

package langAndUtil;
/*
String 클래스에는 문자열을 저장하기 위해서 문자형 배열 참조변수(char[]) value를 인스턴스 변수로 정의해놓고 있다.
인스턴스 생성 시 생성자의 매개변수로 입력받는 문자열은 이 인스턴스변수(value)에 문자형 배열(char[])로 저장되는 것이다.
한번 생성된 String 인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.

예를 들어 아래의 코드와 같이 "+" 연산자를 이용해서 문자열을 결합하는 경우
인스턴스 내의 문자열이 바뀌는 것이 아니라 새로운 문자열("ab")이 담긴 String인스턴스가 생성되는 것이다.

이처럼 덧셈연산자 "+"를 사용해서 문자열을 결합하는 것은
매 연산 시 마다 새로운 문자열을 가진 String 인스턴스가 생성되어 메모리공간을 차지하게 되므로 가능한 한 결합횟수를 줄이는 것이 좋다.

문자열간의 결합이나 추출 등 문자열을 다루는 작업이 많이 필요한 경우에는 String클래스 대신 StringBuffer클래스를 사용하는 것이 좋다.

StringBuffer인스턴스에 저장된 문자열은 변경이 사능하므로 하나의 StringBuffer인스턴스만으로도 문자열을 다루는 것이 가능하다.
*/

public class ObjectStringClass {
    public static void main(String[] args) {
        /*
        문자열을 만들 때는 두 가지 방법, 문자열 리터럴을 지정하는 방법과 String클래스의 생성자를 사용해서 만드는 방법이 있다.

        String클래스의 생성자를 이용한 경우에는 new연산자에 의해서 메모리 할당이 이루어지기 때문에 항상 새로운 String 인스턴스가 생성된다.

        그러나 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다. (문자열 리터럴은 클래스가 메모리에 로드될 때 자동적으로 미리 생성된다.
        */

        String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1에 저장됨
        String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2에 저장됨
        String str3 = new String("abc"); // 새로운 String 인스턴스를 생성
        String str4 = new String("abc"); // 새로운 String 인스턴스를 생성

        /*
        equals()를 사용했을 때는 두 문자열의 내용("abc")을 비교하기 때문에 두 경우 모두 true를 결과로 얻는다.
        하지만, 각 String인스턴스의 주고를 등가비교연산자"=="로 비교했을때는 결과가 다르다.
        */

        String str6 = "abc";
        String str7 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str6 == str7));
        System.out.println("str1.equals(str2) ? " + str6.equals(str7));
        System.out.println();

        String str8 = new String("abc");
        String str9 = new String("abc");

        System.out.println("String str8 = newString(\"abc\");");
        System.out.println("String str9 = newString(\"abc\");");

        System.out.println("str8 == str9 ? " + (str8 == str9));
        System.out.println("str8.equals(str9) ? " + str8.equals(str9));
    }
}

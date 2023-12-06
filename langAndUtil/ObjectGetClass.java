package langAndUtil;

/*
이 메서드는 자신이 속한 클래스의 Class 객체를 반환하는 메서드인데, Class 객체는 이름이 'Class'인 클래스의 객체이다.

Class 객체는 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다.

클래스 파일이 "클래스 로더(ClassLoader)"에 의해서 메모리에 올라갈 때, 자동으로 생성된다.

** 클래스 파일을 메모리에 로드하고 변환하는 일은 클래스 로더가 한다. **

클래스 로더는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다.

먼저 기존에 생성된 클래스 객체가 메모리에 존재하는지 확인하고, 있으면 객체의 참조를 반환하고 없으면 클래스 패스(classpath)에 지정된 경로를 따라서 클래스 파일을 찾는다.

못 찾으면 ClassNotFountExcetion이 발생하고, 찾으면 해당 클래스 파일을 읽어서 Class객체로 변환한다.

*/

public class ObjectGetClass {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 3); // new 연산자로 객체 생성
//        Card1 c2 = Card1.class.newInstance(); // Class객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}

final class Card1 {
    String kind;
    int num;

    Card1() {
        this("SPADE", 1);
    }

    Card1(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}


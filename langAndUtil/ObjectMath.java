package langAndUtil;

/*
Math클래스는 기본적인 수학계산에 유용한 메서드로 구성되어 있다.

Math클래스의 생성자는 접근 제어자가 private이기 때문에 다른 클래스에서 Math인스턴스를 생생할 수 없도록 되어있다.
그 이유는 클래스 내에 인스턴스변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문이다.
Math클래스의 메서드는 모두 static이다.
*/

/*
Math클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호풀해서 사용한다.
즉, OS에 의존적인 계산을 하고 있는 것이다. 예를 들어 부동소수점 계산의 경우, 반올림의 처리방법 설정이 OS마다 다를 수 있기 때문에
자바로 작성된 프로그램임에도 불구하고 컴퓨터마다 결과가 다를 수 있다.
이러한 차이를 없애기 위해 성능은 다소 포기하는 대신, 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록 Math클래스를 새로 작성한 것이 StrictMath클래스이다.
*/

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.negateExact;
import static java.lang.Math.rint;
import static java.lang.Math.round;

public class ObjectMath {
    public static void main(String[] args) {
        /*
        소수점 n번째 자리에서 반올림한 값을 얻기 위해서는 round()를 사용해야 하는데, 이 메서드는 항상 소수점 첫째자리에서 반올림을 해서 정수값(long)을 결과로 돌려준다.
        원하는 자리 수에서 반올림된 값을 얻기 위해서는 간단히 10의 n제곱으로 곱한 후, 다시 곱한 수로 나눠주기만 하면 된다.
        */

        double target = 90.7552;
        // 1. 원래 값에 100을 곱한다 -> 90.7552 * 100 = 9075.52
        target = 90.7552 * 100;
        // 2. 위의 결과에 Math.round()를 사용한다.
        target = round(9075.52);
        // 3. 위 결과를 다시 100.0으로 나눈다.
        target = target /100;
        System.out.println(target); // -> 90.76

        double val = 90.7552;
        System.out.println("round("+ val +")=" + round(val));

        val *= 100;
        System.out.println("round("+ val +")=" + round(val));

        System.out.println("round("+ val +")/100=" + round(val)/100);
        System.out.println("round("+ val +")/100.0=" + round(val)/100.0);
        System.out.println();

        System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1)); // 올림
        System.out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5)); // 버림
        System.out.printf("round(%3.1f)=%d%n", 1.1, round(1.1)); // 반올림
        System.out.printf("round(%3.1f)=%d%n", 1.1, round(1.5)); // 반올림

        // rint()도 round()처럼 소수점 첫 째자리에서 반올림하지만, 반환값이 double이다.
        // 그리고 rint()는 두 정수의 정가운데 있는 값은 가장 가까운 짝수 정수를 반환한다.
        System.out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5)); // 반올림
        System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1)); // 올림
        System.out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); // 반올림
        System.out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5)); // 반올림
        System.out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5)); // 올림
        System.out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5)); // 버림


        /*
        메서드 이름에 'Exact'가 포함된 메서드들은 정수형 간의 연산에서 발생할 수 있는 오버플로우를 감지하기 위한 것이다.
        연산자는 단지 결과를 반환할 뿐, 오버플로우의 발생여부에 대해 알려주지 않는다.
        그러나 위의 메서드들은 오버플로우가 발생하면, 예외(ArithmeticException)를 발생시킨다.

        Java에서 정수 오버플로우는 예외를 발생시키지 않습니다. 대신, 오버플로우가 발생하면 값이 해당 데이터 타입의 최소값으로 다시 돌아갑니다.

        예를 들어, int의 최소값(Integer.MIN_VALUE)은 -2,147,483,648이며, 이를 -i로 변경하면 정수 오버플로우가 발생합니다.

        그러나 Java에서는 이러한 상황에서 예외를 발생시키지 않고 -2,147,483,648로 값을 다시 설정합니다.

        따라서 System.out.println("-i="+(-i));의 결과는 i의 값과 동일한 -2,147,483,648이 됩니다.

        정수 오버플로우를 처리하려면 프로그램에서 오버플로우 검사 및 예외 처리를 명시적으로 수행해야 합니다.

        이렇게 하지 않으면 오버플로우가 발생하더라도 예외는 발생하지 않고 값이 다시 최소값으로 돌아가므로 원치않는 결과를 초래할 수 있습니다.

        */

        int i = Integer.MIN_VALUE;
        System.out.println("i ="+i);
        // 부호를 반대로 바꾸는 식은 '~a+1'이다. '~a'의 결과가 int의 최대값이면, 여기에 1을 더하니까 오버플로우가 발생할 수 있는 것이다.
        System.out.println("-i="+(-i));

        try {
            System.out.printf("negateExact (%d)=%d%n",10,negateExact(10));
            System.out.printf("negateExact (%d)=%d%n",-10,negateExact(-10));
            System.out.printf("negateExact (%d)=%d%n",i,negateExact(i));

        } catch (ArithmeticException e) {
            // i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
            System.out.printf("negateExact(%d)= %d%n", (long)i, negateExact((long) i));
        }
    }
}

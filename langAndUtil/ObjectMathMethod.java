package langAndUtil;

public class ObjectMathMethod {
    public static void main(String[] args) {
        // static double abs(double a)
        // static float abs(float f)
        // static int abs(int f)
        // static long abs(long f)
        // 주어진 값의 절대값을 반환한다.
        int i = Math.abs(-10);
        double d = Math.abs(-10.0);
        System.out.println(i);
        System.out.println(d);

        // static double ceil(double a)
        // 주어진 값을 올림하여 반환한다.
        double d1 = Math.ceil(10.1);
        double d2 = Math.ceil(-10.1);
        double d3 = Math.ceil(10.000015);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // static double floor(double a)
        // 주어진 값을 버림하여 반환한다.
        double d4 = Math.floor(10.8);
        double d5 = Math.floor(-10.8);
        System.out.println(d4);
        System.out.println(d5);

        // static double max(double a, double b)
        // static float max(float a, float b)
        // static int max(int a, int b)
        // static long max(long a, long b)
        // 주어진 두 값을 비교하여 큰 쪽을 반환한다.
        double d6 = Math.max(9.5, 9.50001);
        int i1 = Math.max(0, -1);
        System.out.println(d6);
        System.out.println(i1);

        // static double min(double a, double b)
        // static float min(float a, float b)
        // static int min(int a, int b)
        // static long min(long a, long b)
        // 주어진 두 값을 비교하여 작은 쪽을 반환한다.
        double d7 = Math.min(9.5, 9.50001);
        int i2 = Math.min(0, -1);

        // static double random()
        // 0.0 ~ 1.0 범위의 임의의 double값을 반환한다. (1.0은 범위에 포함되지 않는다.)
        double d8 = Math.random();
        int i3 = (int)(Math.random()*10) + 1;
        System.out.println(d8);
        System.out.println(i3);

        // static long round(double a)
        // static long round(float a)
        // 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다.
        // 매개변수의 값이 음수인 경우, round()와 rint()의 결과가 다르다는 것에 주의하자.
        long l = Math.round(1.2);
        long l2 = Math.round(2.6);
        long l3 = Math.round(3.5);
        long l4 = Math.round(4.5);
        double d9 = 90.7552;
        double d10 = Math.round(d9*100)/100.0;
        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(d9);
        System.out.println(d10);
    }
}

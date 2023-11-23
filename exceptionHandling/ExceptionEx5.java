package exceptionHandling;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1 () throws Exception {
            method2();
    }

    static void method2 () throws Exception {
        throw new Exception();
    }
}

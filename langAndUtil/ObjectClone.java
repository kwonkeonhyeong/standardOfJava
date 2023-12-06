package langAndUtil;

// Object 클래스에 정의된 clone()은 단순히 인스턴스변수의 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.

public class ObjectClone {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone(); // 복제(clone)해서 새로운 객체를 생성
//        Point copy = original.clone(); // 공변 반환타입을 사용하면 형변환 과정이 줄어든다.
        System.out.println(original);
        System.out.println(copy);

        int[] arr = {1,2,3,4,5};
        int[] arrClone = arr.clone();

        int[] arr2 = {1,2,3,4,5};
        int[] arrClone2 = new int[arr.length];
        System.arraycopy(arr2,0,arrClone2,0,arr2.length);
    }
}

// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Object clone() { // 접근 제어자를 protected에서 public으로 변경
        Object obj = null;
        try {
            obj = super.clone(); // clone() 은 반드시 예외처리를 해주어야 한다.
        } catch (CloneNotSupportedException e) {
        }
        return obj;
        // return (Point)obj;
        /*
        공변 반환 타입을 사용하면, 조상의 타입이 아닌,
        실제로 반환되는 자손 객체의 타입으로 반환할 수 있어서
        번거로운 형변환이 줄어든다는 장점이 있다.
        */
    }
}

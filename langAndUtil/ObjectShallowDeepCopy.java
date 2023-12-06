package langAndUtil;

public class ObjectShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point2(1,1),2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후 =");
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}

class Circle implements Cloneable {
    Point2 p; // 원점
    double r; // 반지름

    public Circle(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() { // 얕은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) obj;
    }

    public Circle deepCopy() { // 깊은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle c = (Circle) obj;
        c.p = new Point2(this.p.x, this.p.y);
        return c;
    }

    public String toString() {
        return "[p=" + p + ", r="+ r +"]";
    }
}

class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x +", "+y+")";
    }
}

/*

- 기본형 배열인 경우에는 복제에 하무런 문제가 없지만,
- 객체배열을 clone()으로 복제하는 경우에는 원본과 복제본이 같은 객체를 공유하므로 완전한 본제라고 보기 어렵다.
- 이러한 복제(복사)를 "얕은 복사(shallow copy)"라고 한다.
- 얕은 복사에서는 원본을 변경하면 복사본도 영향을 받는다

- 반면에 원본이 참조하고 있는 객체까지 복제하는 것을 깊은 복사(deep copy)라고 하며,
- 깊은 복사에서는 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.


*/


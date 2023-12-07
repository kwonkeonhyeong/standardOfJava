package langAndUtil;

/*
String 클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만 StringBuffer클래스는 변경이 가능하다.
내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있으며, StringBuffer 인스턴스를 생성할 때 그 크기를 지정할 수 있다.

이 때, 편집할 문자열의 길이를 고려하여 버퍼의 길이를 충분히 잡아주는 것이 좋다.
편집 중인 문자열이 퍼러의 길이를 넘어서게 되면 버퍼릐 길리를 늘려주는 작업이 추가로 수행되어야하기 때문에 작업 효율이 떨어진다.

StringBuffer클래스는 String클래스와 유사한 점이 많다.
StringBuffer클래스는 String클래스와 같이 문자열을 저장하기 위한 char형 배열의 참조변수를 인스턴스 변수로 선언해 놓고 있다.
StringBuffer인스턴스가 생성될 때, char형 배열이 생성되며 이 때 생성된 char형 배열을 인스턴스변수 value가 참조하게 된다.


StringBuffer인스턴스를 생성할 때는 생성자 StringBuffer(int length)를 사용해서
StringBuffer 인스턴스에 저장될 문자열의 길이를 고려하여 충분히 여유있는 크기로 지정하는 것이 좋다.
StringBuffer 인스턴스를 생성할 때, 버퍼의 크기를 지정해주지 않으면 16개의 문자를 저장할 수 있는 크기의 버퍼를 생성한다.

버퍼의 그리가 작업하려는 문자열의 길이보다 작을 때는 내부적으로 버퍼의 크기를 증가시키는 작업이 수행된다.
이 때, 배열의 길이는 변경될 수 없으므로 새로운 길이의 배열을 생성한 수에 이전 배열의 값을 복사해야 한다.
*/


/*
StringBuffer의 비교
String클래스에서는 equals메서드를 오버라이딩해서 문자열의 내용을 비교하도록 구현되어 있지만,
StringBuffer클래스는 equals메서드를 오버라이딩하지 않아서 StringBuffer클래스의 equals 메서드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과를 얻는다.

반면에 toString()은 오버라이딩 되어 있어서 StringBuffer 인스턴스에 toString()을 호출하면, 담고있는 문자열을 String으로 반환한다.
그래서 StringBuffer인스턴스에 담긴 문자열을 비교하기 위해서는 StringBuffer 인스턴스에 toString()을 호출해서 String인스턴스를 얻은 다음, 여기에 equals메서드를 사용해서 비교해야한다.
*/
public class ObjectStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));

        String s = sb.toString(); // String s = new String(sb)와 같다;
        String s2 = sb.toString();

        System.out.println(s.equals(s2));

        // StringBuffer()
        // 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
        StringBuffer st = new StringBuffer();

        // StringBuffer(int length()
        // 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer인스턴스를 생성한다.
        StringBuffer st2 = new StringBuffer(10);

        // StringBuffer(String str)
        // 지정된 문자열 값을 갖는 StringBuffer 인스턴스를 생성한다.
        StringBuffer st3 = new StringBuffer("hi");

        // StringBuffer append(boolean b)
        // StringBuffer append(char c)
        // StringBuffer append(char[] str)
        // StringBuffer append(double d)
        // StringBuffer append(float f)
        // StringBuffer append(int i)
        // StringBuffer append(long i)
        // StringBuffer append(Object obj)
        // StringBuffer append(String str)
        // 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.

        StringBuffer st4 = new StringBuffer("abc");
        StringBuffer st5 = st4.append(true);
        st5.append('d').append(10.0f);
        System.out.println(st4);

        // int capacity()
        // StringBuffer인스턴스의 버퍼크기를 알려준다. length()는 버퍼에 담긴 문자열의 길이를 알려준다.
        StringBuffer st6 = new StringBuffer(100);
        st6.append("abcd");
        int bufferSize = st6.capacity();
        int stringSize = st6.length();

        // char charAt(int index)
        // 지정된 위치(index)에 있는 문자를 반환한다.
        StringBuffer st7 = new StringBuffer("abcd");
        char c = st7.charAt(2);
        System.out.println(c);

        // StringBuffer delete(int start, int end)
        // 시작위치부터 끝 위치 사이에 있는 문자를 제거한다. 단, 끝 위치의 문자는 제외
        StringBuffer st8 = new StringBuffer("0123456");
        StringBuffer st9 = st8.delete(3, 6);
        System.out.println(st9);

        // StringBuffer deleteChatAt(int index)
        // 지정된 위치의 문자를 제거한다.
        StringBuffer st10 = new StringBuffer("0123456");
        StringBuffer st11 = st10.deleteCharAt(3);
        System.out.println(st11);

        // StringBuffer insert(int pos, boolean b)
        // StringBuffer insert(int pos, char c)
        // StringBuffer insert(int pos, char[] str)
        // StringBuffer insert(int pos, double d)
        // StringBuffer insert(int pos, float f)
        // StringBuffer insert(int pos, int i)
        // StringBuffer insert(int pos, long l)
        // StringBuffer insert(int pos, Object obj)
        // StringBuffer insert(int pos, String str)
        // 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치에 추가한다. pos는 0부터 시작
        StringBuffer st12 = new StringBuffer("0123456");
        st12.insert(4, '.');
        System.out.println(st12);

        // int length()
        // StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환한다.
        StringBuffer st13 = new StringBuffer("0123456");
        System.out.println(st13.length());

        // StringBuffer replace(int start, int end, String str)
        // 지정된 범위의 문자들을 주어진 문자열로 바꾼다. end 위치의 문자는 범위에 포함되지 않음.
        StringBuffer st15 = new StringBuffer("0123456");
        st15.replace(3, 6, "AB");
        System.out.println(st15);

        // StringBuffer reverse()
        // StringBuffer인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
        StringBuffer st16 = new StringBuffer("0123456");
        System.out.println(st16.reverse());
        System.out.println(st16);

        // void setCharAt(int index, char ch)
        // 지정된 위치의 문자를 주어진 문자로 바꾼다.
        StringBuffer st17 = new StringBuffer("-123456");
        st17.setCharAt(0, '0');
        System.out.println(st17);

        // void setLength(int newLength)
        // 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우에 나머지 빈 공간을 널문자 '\u0000'로 채운다.
        StringBuffer st18 = new StringBuffer("0123456");
        st18.setLength(5);

        StringBuffer st19 = new StringBuffer("0123456");
        st19.setLength(10);
        String str = st19.toString().trim();
        System.out.println(st18);
        System.out.println(st19);
        System.out.println(str);

        // String toString()
        // StringBuffer인스턴스의 문자열을 String으로 반환
        StringBuffer st20 = new StringBuffer("0123456");
        String str1 = st20.toString();

        // String substring(int start)
        // String substring(int start, int end)
        // 지정된 범위 내의 문자열을 String으로 뽑아서 반환한다. 시작위치만 지정하면 시작위치부터 문자열 끝까지 봅아서 반환한다.
        StringBuffer st21 = new StringBuffer("0123456");
        String str2 = st21.substring(3);
        String str3 = st21.substring(3, 5);
        System.out.println(str2);
        System.out.println(str3);
    }
}

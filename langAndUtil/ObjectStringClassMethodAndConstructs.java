package langAndUtil;

import java.util.Locale;

public class ObjectStringClassMethodAndConstructs {
    public static void main(String[] args) {
        // String(String s)
        // 주어진 문자열을 갖는 String인스턴스를 생성한다.
        String s1 = new String("Hello");

        // String(char[] value)
        char[] c = {'H','e','l','l','o'};
        // 주어진 문자열을 갖는 String인스턴스를 생성한다.
        String s2 = new String(c);

        // String(StringBuffer buf)
        StringBuffer sb = new StringBuffer("Hello");
        // StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
        String s3 = new String(sb);

        // char charAt(int index)
        String s4 = "Hello";
        String n = "0123456";
        // 지정된 위치(index)에 있는 문자를 알려준다. (index는 0부터 시작)
        char c2 = s4.charAt(1);
        char c3 = n.charAt(1);

        // int compareTo(String str)
        // 문자열과 사전순서로 비교한다. 같으면 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
        int o = "aaa".compareTo("aaa");
        int o1 = "aaa".compareTo("bbb");
        int o2 = "bbb".compareTo("aaa");

        // String concat(String str)
        // 문자열을 뒤에 덧붙인다.
        String s5 = "hello";
        String s6 = s5.concat("world");

        // boolean contains(CharSequence s)
        // 지정된 문자열이 포함되었는지 검사한다.
        String s7 = "abcedfg";
        boolean b = s7.contains("g");

        // boolean endsWith(String suffix)
        // 지정된 문자열로 끝나는지 검사한다.
        String file = "Hello.txt";
        boolean b1 = file.endsWith(".txt");

        // boolean equals(Object obj)
        // 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다.
        // obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
        String s8 = "Hello";
        boolean b2 = s8.equals("Hello");
        boolean b3 = s8.equals("hello");

        // boolean equalsIgnoreCase(String str)
        // 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
        String s9 = "Hello";
        boolean b4 = s9.equalsIgnoreCase("HELLO");
        boolean b5 = s9.equalsIgnoreCase("heLLo");

        // int indexOf(int ch)
        // 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
        // 못 찾으면 -1을 반환한다. (index는 0부터 시작)
        String s10 = "Hello";
        int idx1 = s10.indexOf("o");
        int idx2 = s10.indexOf("l");

        // int indexOf(int ch, int pos)
        // 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다.
        // 못 찾으면 -1을 반환한다. (index는 0부터 시작)
        String s11 = "hello";
        int idx3 = s11.indexOf("o",0);
        int idx4 = s11.indexOf("o",2);

        // int indexOf(String str)
        // 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다.
        // 없으면 -1을 반환한다. (index는 0부터 시작)
        String s12 = "ABCDEFG";
        int idx = s12.indexOf("CD");

        // 문자열을 상수풀(constant pool)에 등록한다.
        // 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
        String s13 = new String("abc");
        String s14 = new String("abc");
        boolean b7 = (s13 == s14);
        boolean b8 = s13.equals(s14);
        boolean b9 = (s13.intern() == s14.intern());
        System.out.println(s13.hashCode());
        System.out.println(s14.hashCode());

        // int lastIndexOf(int ch)
        // 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다.
        // 못 찾으면 -1을 반환한다.
        String s15 = "java.lang.Object";
        int idx5 = s15.lastIndexOf('.');
        int idx6 = s15.indexOf('.');
        System.out.println(idx5);
        System.out.println(idx6);

        // int lastIndexOf(String str)
        // 지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를 알려준다.
        // 못 찾으면 -1을 반환한다.
        String s16 = "java.lang.java";
        int idx7 = s16.lastIndexOf("java");
        int idx8 = s16.indexOf("java");
        System.out.println(idx7);
        System.out.println(idx8);

        // int length()
        // 문자열의 길이를 알려준다.
        String s = "Hello";
        int length = s.length();

        // String replace(char old, char nw)
        // 문자열 중의 문자를 새로운 문자로 바꾼 문자열을 반환한다.
        String s17 = "hello";
        String s18 = s17.replace('H','C');

        // String replace(CharSequence old, CharCharSequence nw)
        // 문자열 중의 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
        String s19 = "hello";
        String s20 = s19.replace("ll","LL");

        // String replaceAll(String regex, String replacement)
        // 문자열 중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열로 모두 변경한다.
        String ab = "AABBAABB";
        String r = ab.replaceAll("BB", "AA");
        System.out.println(r);

        // String replaceFirst(String regex, String replacement)
        // 문자열 중에서 지정된 문자열과 일치 하는 것 중, 첫 번째 것만 새로운 문자열로 변경한다.
        String ab1 = "AABBAABB";
        String r1 = ab1.replaceFirst("BB", "AA");
        System.out.println(r1);

        // String[] split(String regex)
        // 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다.
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // String[] split(String regex, int limit)
        // 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다. 단, 문자열 전체를 지정된 수로 자른다.
        String animals2 = "dog,cat,bear";
        String[] arr2 = animals2.split(",",2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        // boolean startsWith(String prefix)
        // 주어진 문자열로 시작하는지 검사한다.
        String s21 = "java.lang.Object";
        boolean b10 = s21.startsWith("java");
        boolean b11 = s21.startsWith("lang");
        System.out.println(b10);
        System.out.println(b11);

        // String substring(int begin)
        // String substring(int begin, int end)
        // 주어진 시작위치부터 끝 위치 범위에 포함된 문자열을 얻는다.
        // 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다. (begin <= x < end)
        String s22= "java.lang.Object";
        String e = s22.substring(10);
        String d = s22.substring(5,9);
        System.out.println(e);
        System.out.println(d);

        // String toLowerCase()
        // String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
        String s23 = "HELLO";
        String s24 = s23.toLowerCase();
        System.out.println(s24);

        // String toString()
        // String인스턴스에 저장되어 있는 문자열을 반환한다.
        String s25 = "Hello";
        String s26 = s25.toString();
        System.out.println(s26);

        // String toUpperCase()
        // String인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
        String s27 = "Hello";
        String s28 = s27.toUpperCase();
        System.out.println(s28);

        // String trim()
        // 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다.
        // 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
        String s29 = "     Hello World    ";
        String s30 = s29.trim();
        System.out.println(s30);

        // static String valueOf(boolean b)
        // static String valueOf(char c)
        // static String valueOf(int i)
        // static String valueOf(long i)
        // static String valueOf(float f)
        // static String valueOf(double d)
        // static String valueOf(Object o)
        // 지정된 값을 문자열로 변환하여 반환한다.
        // 참조변수의 경우, toString()을 호출한 결과를 반환한다.
        String h = String.valueOf(true);
        String h1 = String.valueOf('a');
        String h2 = String.valueOf(100);
        String h3 = String.valueOf(100L);
        String h4 = String.valueOf(10f);
        String h5 = String.valueOf(10.0);
        java.util.Date dd = new java.util.Date();
        String date = String.valueOf(dd);

        System.out.println(h);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(dd);


    }
}

package langAndUtil;

import java.util.StringJoiner;

/*
join()은 여러 문자열 사이에 구분자를 넣어서 결합한다. 구분자로 문자열을 자르는 split()과 반대의 작업을 한다고 생각하면 이해하기 쉽다.
*/
public class ObjectStringJoin {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]");
        for(String s: arr)
            sj.add(s);

        System.out.println(sj.toString());

    }
}

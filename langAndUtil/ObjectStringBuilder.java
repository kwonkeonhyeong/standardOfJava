package langAndUtil;

/*
StringBuilder란?
StringBuffer는 멀티쓰레드에 안전(thread safe)하도록 동기화되어 있다.
멀티쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어뜨리게 된다.
그래서 StringBuffer에서 쓰레드의 동기화만 뺀 StringBuilder가 새로 추가되었다.

StringBuffer도 충분히 성능이 좋기 때문에 성능햘상이 반드시 필요한 경우를 제외하고는 기존에 작성한 코드에서
StringBuffer를 StringBuilder로 굳이 바꿀 필요는 없다.
*/
public class ObjectStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("abc");
    }
}

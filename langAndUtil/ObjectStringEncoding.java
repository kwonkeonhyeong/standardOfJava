package langAndUtil;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

/*
getBytes(String charsetName)를 사용하면, 문자열의 문자 인코딩을 다른 인코딩으로 변경할 수 있다.
*/
public class ObjectStringEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] utf8_str = "가".getBytes("UTF-8"); // 문자열을 UTF-8로 변환
        String str1 = new String(utf8_str, "UTF-8"); // byte배열을 문자열로 변환

        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8:" + joinByteArr(bArr));
        System.out.println("CP949:" + joinByteArr(bArr2));

        System.out.println("UTF-8:" + new String(bArr, "UTF-8"));
        System.out.println("CP949:" + new String(bArr2, "CP949"));
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":","[", "]");

        for(byte b : bArr)
            sj.add(String.format("%02X",b));
        return sj.toString();
    }
}

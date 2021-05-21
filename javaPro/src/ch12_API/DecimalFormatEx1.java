package ch12_API;

import java.text.DecimalFormat;
import java.text.ParseException;
//1244.56 -> 1,244.56 -> 이런걸 에디팅 했다고 함
//Number num = df1.parse("1,234.56"); 문자 ---> 숫ㅈ자
//df1.format(d) ; 숫자 -----> editting 문자
public class DecimalFormatEx1 {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		try {
			Number num = df1.parse("1,234.56"); //
			double d = num.doubleValue(); //넘버가 가진 값을 더블타입의 숫자로 해라 넘버는 래퍼라네. 디폴트를 int로 바뀌는 그런건 없다
			d+=10;
			System.out.println(d + "->" + df1.format(d));
			System.out.println(d + "->" + df2.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

//참조형에서 디폴트는 null
package api10_Pattern;

import java.util.regex.Pattern;

// 문자열 정규식
public class Test4 {
	public static void main(String[] args) {
		
		String regEx1 = "^[abc]*$"; //시작에 a 또는 b또는 c 문자가 포함되어 있니? ^[abc]*$, ^[a|b|c]*$
		//a로 시작해서 끝나야 하고 b로 시작해서 끝나야하고 c로 시작해서 끝나야하는것
		//시작과 끝나는 문자에 a,b,c 가 포함되어 있으면 참
		
		String str1 = "1234";
		String str2 = "1234ghjk";
		String str3 = "aaa";
		String str4 = "bc";
		String str5 = "asdfb";
		String str6 = "asdf ";
		String str7 = "asDf";
		String str8 = "abcsDf";
		
		System.out.println("1. : " + Pattern.matches(regEx1, str1));
		System.out.println("2. : " + Pattern.matches(regEx1, str2));
		System.out.println("3. : " + Pattern.matches(regEx1, str3));
		System.out.println("4. : " + Pattern.matches(regEx1, str4));
		System.out.println("5. : " + Pattern.matches(regEx1, str5));
		System.out.println("6. : " + Pattern.matches(regEx1, str6));
		System.out.println("7. : " + Pattern.matches(regEx1, str7));
		System.out.println("8. : " + Pattern.matches(regEx1, str8));
		
	}
}

package api4_String;

//concat() : 문자열과 문자열의 결합(+연산자와 비슷(?))
//contains() : 문자열의 포함 유무(있으면 true, 없으면 false를 반복
public class T13_concat { //많이 쓴다, 데이터 베이스에 특히 많이 사용 
	public static void main(String[] args) {
		
		String str1 = "서울";
		String str2 = "부산";
		String gubun = "%";
		String res = "";
		
		res = str1 + gubun + str2; //연산자 사용
		System.out.println("1.res : " + res); //서울%부산
		
		res = str1.concat(gubun).concat(str2); //메소드 사용
		System.out.println("2.res : " + res); //서울%부산
		System.out.println();
		
		System.out.println(gubun.concat(str1).concat(gubun) ); //%서울%
		
		
		
		
	}

}

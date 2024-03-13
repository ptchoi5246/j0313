package api4_StringREVIEW;

public class T01_trim2 {
	//글자 바깥쪽 공백 제거
	public static void main(String[] args) {
		
		String str = "     복 습 중     ";
		String res;
		
		res = "1234" + str + "ABCD";
		System.out.println("1.res : " + res);
		
		res = "1234" + str.trim() + "ABCD";
		System.out.println("2.res : " + res);
		System.out.println("복습 완료");
	}
}

package api3_ClassREVIEW;

public class Test1_2 {
	public static void main(String[] args) {
//try-catch
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.패키지에 String 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("java.lang.패키지에 String 클래스가 없습니다." + e.getMessage());
		} finally { //복습 추가
			System.out.println("복습 완료 :)");
		}
	}
}

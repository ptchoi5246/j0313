package api1_Object;

import java.util.Objects;

public class T3_isNull {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		System.out.println("vo : + " + vo);
		
		if(vo == null) System.out.println("1. vo는 null 입니다.");
		else System.out.println("1. vo는 null이 아닙니다."); //출력
		System.out.println();
		//객체에 비교하면 안 된다.
		//vo에 데이터를 안 넣어도 null이 아니다.
		
		if(vo.getName() == null) System.out.println("2. vo.getName()는 null 입니다."); //출력
		else System.out.println("2. vo.getName()는 null이 아닙니다.");
		System.out.println();
		
		if(Objects.isNull(vo)) System.out.println("3. vo는 null 입니다.");
		else System.out.println("3. vo는 null이 아닙니다.");
		System.out.println();
		//메소드 비교
		
		if(Objects.nonNull(vo)) System.out.println("4. vo는 null 아닙니다.");
		else System.out.println("4. vo는 null입니다..");
		System.out.println();
		
		vo.setName("홍길동");		
		if(Objects.nonNull(vo.getName())) {
			System.out.println("5. name : " + vo.getName());
			if(vo.getName().equals("홍길동")) System.out.println("관리자");
			else System.out.println("방문객");
		}
		else System.out.println("5. vo.getName()는 null입니다.");
		System.out.println();
		
		vo.setName("홍길동");		
		if(vo.getName().equals("홍길동")) {
//			if(vo.getName().equals("홍길동")) System.out.println("관리자");
//			else System.out.println("방문객");
		}
		else System.out.println("6. vo.getName()는 null입니다.");
		System.out.println();
		
		vo.setName(null);
		System.out.println("7. name : " + vo.getName());
		System.out.println("8. name : " + Objects.requireNonNull(vo.getName()));
		
		
		
		
		
		
		
	} 
}

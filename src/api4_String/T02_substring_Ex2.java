package api4_String;
//무조건 연습하기!!!!!
import java.util.Scanner;
//indexOf(n,m) :: 시작위치,
public class T02_substring_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		int position=-1, cnt=0;
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.next();
		
		while(true) { //substring 사용 안함
			position = msg.indexOf(str, position+1); //position 초기값 -1, 0부터 시작이라 +1 
			//while문 돌고 다시 올 때 0부터 시작이라 -1에 +1 사용
			// 0 5 10 13 - 글자 누적 필요 없음
			if(position == -1) break;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + position);
			cnt++;
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}

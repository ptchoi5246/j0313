package api4_String;

import java.util.Scanner;
//indexOf(n)
public class T02_substring_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		//알파벳 찾는다 = charAT() 사용
		int position, totPosition=0, cnt=0; //totPosition = 누적위치
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.nextLine();
		
		while(true) { //반복문 사용해도 됨
			position = msg.indexOf(str); //position : 위치
			//position : 위치 msg.indexOf(시작부터의 위치, 시작부터 위치 끝나고 다시 시작부터의 위치) 
			//ex) o = 4 /1+4=5, 앞에 찾은 자리 +4 = 9/1+2+9 = 12
			if(position == -1) break;
			totPosition += position;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + totPosition);
			msg = msg.substring(position + 1); //position +1 = 0번지부터 시작이라서 무조건 +1 해야된다
			cnt++;
			totPosition++;
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}

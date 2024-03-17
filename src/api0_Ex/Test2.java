package api0_Ex;

import java.util.Scanner;

/*
  콘솔을 통해서 아이디를 입력받는다.
  단, 아이디는 영문대문자,영문소문자,숫자와 특수문자는 '_'을 사용할 수 있고,
  길이는 4~20자 이내로 입력받을수 있도록 처리한다.
  단, 기회는 3번으로 처리후 3번안에 처리못하면 작업을 20초간 종료시키게 한다.
  예) 아이디를 입력하세요? abc
     ==> 입력된 아이디 abc는 사용하실수 없습니다.
     계속할까요?(y/n)  Y
     -----------------------------------
     아이디를 입력하세요? abc!
     ==> 입력된 아이디 abc!는 사용하실수 없습니다.
     계속할까요?(y/n)  Y
     -----------------------------------
     아이디를 입력하세요? abcdefghijklmnopqrstuvwzyz
     ==> 입력된 아이디 abcdefghijklmnopqrstuvwzyz는 사용하실수 없습니다.
     20초가 사용이 제한됩니다.
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~(20초간 기다림.....)
     
     아이디를 입력하세요? atom1234!
     ==> 입력된 아이디 atom1234!는 사용하실수 없습니다.
     계속할까요?(y/n)  Y
     -----------------------------------
     아이디를 입력하세요? atom1234
     ==> 입력된 아이디 는 사용하실수 없습니다.
     atom1234 로그인 되었습니다.
*/
public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;
		
		while(true) {
			int sw = 0;
			cnt++;
			
			System.out.println("아이디를 입력하세요~!  ");
			String id = sc.next();
			
			if(id.length() < 4 || id.length() > 20) sw=1; //id의 길이가 4미만 또는 20 이상일 때 sw =1
			else { //그렇지 않으면
				for(int i=0; i<id.length(); i++) { //i가 입력받은 id의 길이만큼 반복
					if(!temp.contains(String.valueOf(id.charAt(i)))) { //String.valueOf() :()안의 객체를 String 객체로 형변환
						//.charAt(인덱스 번호) 인덱스 번호 char문자 변환
						sw = 1;//id가 temp에 포함되지 않다면 sw=1;
						break;
					}
				}
			}
			
			if(sw==1) { //sw == 1 : 아이디 조건에 부적절
				System.out.println("입력된 아이디는 사용하실 수 없습니다.");
				System.out.println("아이디는 영문 대문자, 소문자, 숫자, 특수문자 '_' 포함, 4~20자리까지만 가능합니다.");
				if(cnt == 3) cnt = stop(); //시도 횟수 3회면 10초 정지 //정지 stop 메소드 만들기
			}
			else { //아이디 조건에 맞으니 로그인 가능
				System.out.println(id + " 님 환영합니다.");
				break;
			}
		}
		sc.close();
	}
	
	private static int stop() {
		System.out.println("==============================");
		System.out.println("로그인 3번 실패로 20초간 작업이 중지됩니다.");
		for(int i=1; i<=20; i++) {
			System.out.print("." + i + ".");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
		System.out.println();
		System.out.println("다시 로그인 하세요. 기회는 3번 입니다.");
		System.out.println("==============================");
		return 0;
	}
}

package api0_Ex;

import java.util.Scanner;

/*
  콘솔을 통해서 파일명을 입력받은후, 입력받은 파일의 성격을 구해서 화면에 출력하시오.
  예) 화일명을 입력하세요? abc.jpg
     abc.jpg ==> 그림파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? atom.txt
     atom.txt ==> 텍스트파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? mbc.zip
     mbc.zip ==> 압축파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? sbs.xlsx
     sbs.xlsx ==> 엑셀파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? seoul.hwp
     seoul.hwp ==> 한글파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? busan.gif
     busan.hwp ==> 그림파일
     계속할까요?(Y/N) n
     ================================
     수고하셨습니다.
*/
public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//배열 사용
		String[] extName = {"jpg","txt","zip","xlsx","hwp","gif"};
		String[] korName = {"그림","텍스트","압축","엑셀","한글","그림"};
		
		while(true) {
			System.out.println("==============================");
			System.out.println("파일명을 입력하세요~!  ");
			String fileName = sc.next();
			
			int cnt=0;
			String ext = fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase();
			//.substring(문자열 가르기:fileName의 .뒤의 문자열)
			for(int i=0; i<extName.length; i++) { //i는 배열의 크기만큼 반복
				if(ext.equals(extName[i])) { //.뒤의 문자열 = extName과 같으면
					System.out.println("==>" + korName[i] + "파일 입니다.");
					break; //탈출 -> 계속하시겠습니까?
				}
				cnt++; //횟수 증가
			}
			if(cnt == extName.length) { //횟수 = 배열 크기랑 같으면 => 배열크기를 다 돌았는데 없다.
				System.out.println("잘못된 파일형식 입니다. 다시 입력하세요~!");
			}	
			
			System.out.println("계속하시겠습니까? (Y/N)"); //Y -> while문 처음으로 다시 돌아감
			String ans = sc.next();
			if(ans.toUpperCase().equals("N")) { //N -> 탈출 -> 작업 종료
				break;
			}
		}	
		System.out.println("=> 작업을 종료합니다. 감사합니다.");
		System.out.println("==============================");
		sc.close();
	}
}
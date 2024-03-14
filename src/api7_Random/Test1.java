package api7_Random;

import java.util.Random;

public class Test1 {
	//승부조작 난수함수
	public static void main(String[] args) {
		
		Random random = new Random(); //import
		System.out.println(random.nextInt()); //-2 31제곱 ~ 2 31제곱-1 숫자 //2의 32승의 정수형 난수 발생
		System.out.println(random.nextLong()); //-2 63제곱 ~ 2 63제곱-1 숫자 //2의 64승의 정수형 난수 발생
		System.out.println(random.nextDouble()); //실수형 난수 발생 //Float보다 길다
		System.out.println(random.nextFloat()); //실수형 난수 발생
		System.out.println(random.nextBoolean()); //논리형 난수 발생
		System.out.println();
		System.out.println("0~9 난수 발생 : " + random.nextInt(10)); //0~9 까지의 정수
		System.out.println("1~10 난수 발생 : " + (random.nextInt(10)+1)); //Math.random() //이해안됨 //다시 확인해보기
		System.out.println("5~10 난수 발생 : " + (random.nextInt(10+1-5)+5)); //Math.random()
		System.out.println("20~30 난수 발생 : " + (random.nextInt(30+1-20)+20)); //Math.random()
		System.out.println();
		
		//클래스 안의 매개값으로 난수를 고정시킬 수 있다.
		Random random1 = new Random(5);
		for(int i=1; i<=6; i++) {
			System.out.print((random1.nextInt(45)+1) + " "); //난수 안 변함 //Radom(n) 난수표의 n번째 난수 표출
		}
		System.out.println();
		
		Random random2 = new Random(10);
		for(int i=1; i<=6; i++) {
			System.out.print((random2.nextInt(45)+1) + " "); //난수 안 변함 //Radom(n) 난수표의 n번째 난수 표출
		}
		System.out.println();
		
		Random random3 = new Random();
		for(int i=1; i<=6; i++) {
			System.out.print((random3.nextInt(45)+1) + " "); //난수 변함
		}		
	}
}

package api7_Random.REVIEW;

import java.util.Random;

public class Test1_2 {
	//승부조작 난수함수
	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		System.out.println();
		System.out.println("0~9 난수 발생 : " + random.nextInt(10));
		System.out.println("1~10 난수 발생 : " + (random.nextInt(10)+1)); //Math.random() //이해안됨 //다시 확인해보기
		System.out.println("5~10 난수 발생 : " + (random.nextInt(10+1-5)+5));
		System.out.println("20~30 난수 발생 : " + (random.nextInt(30+1-20)+20));
		System.out.println();
		
		//클래스 안의 매개값으로 난수를 고정시킬 수 있다.
		Random random1 = new Random(100);
		for(int i=1; i<=6; i++) {
			System.out.print((random1.nextInt(45)+1) + " ");
		}
		System.out.println();
		
		Random random2 = new Random(1000);
		for(int i=1; i<=6; i++) {
			System.out.print((random2.nextInt(45)+1) + " ");
		}
		System.out.println();
		
		Random random3 = new Random();
		for(int i=1; i<=6; i++) {
			System.out.print((random3.nextInt(45)+1) + " ");
		}
		System.out.println();
		System.out.println("복습 완료 :)");
	}
}


package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { //equals가 Object 상속 받고 있어서 Override 가능
		if(this.name == ((Bb)obj).name) return true; //다운캐스팅
		else return false;
	}
	
	@Override
	public int hashCode() { //객체의 동등비교
		
		return name.hashCode();
	}
	//객체의 동등비교 : hashCode와 equals로 비교했을 때 같으면 같다.
	
}


public class T1_hashcode1 {
	public static void main(String[] args) {
		//HashMap
		HashMap<Integer, String>  map = new HashMap<>(); //타입을 여러개해서 분리해서 비교하는 것 : 제너릭
		
		
		map.put(1, "데이터1");
		map.put(1, "데이터2"); //map 에서는 키가 같으면 밸류가 덮어쓴다.
		map.put(2, "데이터3");
		System.out.println(map);
		//map 형식은 순서와 관련이 없다.
		
		HashMap<Aa, String> map2 = new HashMap(); //새로 생성 - 다 다르다.
		map2.put(new Aa("첫번째"), "데이터1"); 
		map2.put(new Aa("첫번째"), "데이터2"); 
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
		
		
		
		
		
	}
}

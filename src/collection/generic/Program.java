package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		
		
		//20160329
		//ArrayList 실습
		//순서를 기준으로 값 꺼냄
		System.out.println("<List>");
		
		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("Nice to meet you!");
		list.add("Hello");
		list.add("Nice to meet you!");
		
		/*for(int i=0; i<list.size();i++)
			System.out.println(list.get(i));*/
		
		for(String s : list) // list에 저장된 String 객체를 하나씩 가져옴
			System.out.println(s);
		
		//Set
		//반복된 값 저장하지 않고 데이터 값(key) 자체가 식별자 모든 데이터를 열거
		System.out.println("<Set>");
		
		Set<String> sets = new HashSet<>();
		
		sets.add("Hello");
		sets.add("Nice to meet you!");
		sets.add("Hello");
		sets.add("Nice to meet you!");
		
		//get()이 없어서 Iterator 활용
		//HashSet은 중복된 내용을 저장하지 않음
		for(String s : sets)
			System.out.println(s);
		
			
		/*Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
		
		//Map
		//Key 값에 이름을 붙임
		System.out.println("<Map>");
		
		Map<String, String> map = new HashMap();
		
		map.put("name", "김소희");
		map.put("age", "24"); //중복이 안되고 대체해버림
		map.put("age", "25");
		
		System.out.println(map.get("age"));
		
		
		
		//이전에는  컬랙션에서 객체를 읽어낼 때마다 형변환을 해야했음
		//제네릭은 프로그래머가 원하는 객체의 타입을 명시하여
		//의도하지 않은 객체는 저장하지 않고
		//컴파일시에 오류를 확인하는 방법

		//다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스 컴파일 시의 타입 체크를 해주는 기능

		//generic = 템플릿 = 틀(구멍난 완제품)
		/*GCollection<Exam> list = new GCollection<Exam>();
		 *GCollection의 구멍 채우기!
		 * //<T extends Exam> 했으므로 Exam에서 확장된 것들만 사용 가능

		list.add(3);
		list.add("11");
		list.add(30.3);
		list.add(new Exam());*/	

		
		
		//Thread
/*		GCollection list = new GCollection();
		
		for(int i=0; i<300; i++ )
			list.add(i+1);
		
		//직접 관리
		for(int i=0; i<300; i++ )
			list.get(i);
		
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				print(2, list);
			
			}
		});
		
		th.start(); // 시작
		print(1, list);*/

		
		
		//자동
		//Thread가 안전하지 않다
		
		/*list.clear();
		while(list.hasNext())
			System.out.println(list.netx());*/
		
		//print(2, list);
	}
	
	/*private static void print(int key, GCollection list){
	
		
		
		for(int i=0; i<200; i++ )
			System.out.printf("key: %d, value: %d\n", key, list.get(i));
		ArrayList a = new ArrayList<>();
		Map<String, String> m = new HashMap<>();
		
		Iterator it = list.iterator();
		it.clear();
		while(it.hasNext())
			System.out.printf("key: %d, value: %d\n", key, it.netx());
	}*/

}

package boxing;

public class Program {
	
	public static void add(Integer x){//박싱
		++x;//박스 안의 값이 더해짐
	}

	public static void main(String[] args) {
		
		Integer x = new Integer(3);
		add(x); //자신의 값을 꺼내서 전달, 언박싱
		System.out.println(x);
		//참조는 전달 X, 값이 전달됨
		//공유 불가능
		
		//Boxing: 기본 타입을 객체로 감싸는 과정
		//모든 데이터를 단일하게 일괄 관리하기 위한 방법
		//같은 자료형만 일괄 관리가 가능했음
		
		//Wrapping = Boxing
		//정수를 객체화 하는 과정이 필요했다.
		
		//Object obj = new Integer(3);
		
		//자바의 모든 객체는 Object
		
		//하지만 이제 자동으로 박스에 3을 넣어 참조시키고 있음
		//Object obj = 3;
		
		//Integer와 int는 달라요
		//Integer x = 3; ->Boxing하고 힙 영역에 메모리 올라감, 부담스러움
		
		/*Integer x=3;
		int y =4;
		Integer z=x.valueOf(3)+y;
		System.out.print(z);*/
		
		//x는 참조변수(주소)이므로 4와 더할 수 없음
		//x.valueOf(int) 했어야 함
		//하지만 자동으로 unBoxing 해줌
		
	}

}

package collection.generic;
public class GCollection<T> {//자료형을 구멍낸 것, <T>
	//<구멍> 구멍낸거 알려줌
	
	//제네릭
	//결정짓지 않으려고 만든 것
	//컴파일러에게 템플릿, 자료형 알려줌
	//컴파일러가 알아서 클래스 생성해줌
	
	//값은 그릇을 마련, 그러나 연산자나 자료형은 그럴 수 없음
	//연산 = 인터페이스
	//자료형 = 구멍을 냄
	
	//G=템플릿, 달라지는 부분이 있다면 구멍을 내겠다
	//범용적으로 사용
	
	private T[] data;//= new Exam[3];
	private int current;//= -1;
	
	//성적 데이터를 수집하기 위한 필수 필드
	private int capacity; //전체 용량
	private int amount; //추가 증가량
	
	public GCollection() {
		capacity = 3;
		amount = 5;
		data = (T[]) new Object[capacity]; //Object로 객체를 생성한 뒤에 <T>형으로 형변환
		//객체 생성한 부분에는 T 쓸 수 없음
		//C++에서는 가능
		//참조형만 의미있는 제네릭
		
		//new에서 구멍낼 수 없어요
		//묶었다
		current = -1; // 묶었다
	}
	
	//중첩 클래스
	public class Iterator
	{
		private int index;
		
		public Iterator() {
			index = -1;
		}
		public T netx() {
			return data[++index];
		}
		
		public boolean hasNext() {		
			return index < current;
		}

		public void clear() {
			index = -1;		
		}
	}

	public int size() {
		return current + 1;
	}

	public T get(int i) {		
		return data[i];
	}
	
	public void add(T exam) {
		++current;
		
		//저장한 exam 값을 받아와서 배열에 차례대로 넣음
		//만약에 공간이 모자라면 공간을 늘려준다.
		
		if(capacity <= current)
		{
			//새로운 크기의 배열(데이터를 수집하고 관리)을 만드는 것
			T[] temp = (T[]) new Object[capacity+amount];
			
			//exams의 값을 temp에 대입
			for(int i=0;i<capacity;i++)
				temp[i]=data[i];
			
			//이름표를 바꿔주었음, 새로운 배열이 참조되어야 함
			data = temp;
			
			//exams = new Exam[capacity]의 capacity를 늘어난 새로운 값으로 바꿔줌
			capacity = capacity+amount;
		}
		
		data[current] = exam;
	}


	public Iterator iterator() {
		
		return new Iterator();
	}

}
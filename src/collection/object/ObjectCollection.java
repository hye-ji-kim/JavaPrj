package collection.object;
public class ObjectCollection {
	//범용적으로 사용
	
	private Object[] data;//= new Exam[3];
	private int current;//= -1;
	
	//성적 데이터를 수집하기 위한 필수 필드
	private int capacity; //전체 용량
	private int amount; //추가 증가량
	
	
	public ObjectCollection() {
		capacity = 3;
		amount = 5;
		data = new Object[capacity]; // 묶었다
		current = -1; // 묶었다
	}

	public int size() {
		return current + 1;
	}

	public Object get(int i) {		
		return data[i];
	}

	public void add(Object exam) {
		++current;
		
		//저장한 exam 값을 받아와서 배열에 차례대로 넣음
		//만약에 공간이 모자라면 공간을 늘려준다.
		
		if(capacity <= current)
		{
			//새로운 크기의 배열(데이터를 수집하고 관리)을 만드는 것
			Object[] temp = new Object[capacity+amount];
			
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

}
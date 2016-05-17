package collection;
public class ExamCollection {
	private Exam[] exams;//= new Exam[3];
	private int current;//= -1;
	
	//콜렉션: 같은 타입의 참조값을 여러개 저장하기 위한 자바 라이브러리
	//Java에서 데이터를 저장하는 기본적인 자료구조들을 한 곳에 모아 관리하고 편하게 사용하기 위해서 제공하는 것
	
	
	//성적 데이터를 수집하기 위한 필수 필드
	private int capacity; //전체 용량
	private int amount; //추가 증가량
	
	
	public ExamCollection() {
		capacity = 3;
		amount = 5;
		exams = new Exam[capacity]; // 묶었다
		current = -1; // 묶었다
	}

	public int size() {
		return current + 1;
	}

	public Exam get(int i) {		
		return exams[i];
	}

	public void add(Exam exam) {
		++current;
		
		//저장한 exam 값을 받아와서 배열에 차례대로 넣음
		//만약에 공간이 모자라면 공간을 늘려준다.
		
		if(capacity <= current)
		{
			//새로운 크기의 배열(데이터를 수집하고 관리)을 만드는 것
			Exam[] temp = new Exam[capacity+amount];
			
			//exams의 값을 temp에 대입
			for(int i=0;i<capacity;i++)
				temp[i]=exams[i];
			
			//이름표를 바꿔주었음, 새로운 배열이 참조되어야 함
			exams = temp;
			
			//exams = new Exam[capacity]의 capacity를 늘어난 새로운 값으로 바꿔줌
			capacity = capacity+amount;
		}
		
		exams[current] = exam;
	}

}
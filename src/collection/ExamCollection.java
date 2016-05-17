package collection;
public class ExamCollection {
	private Exam[] exams;//= new Exam[3];
	private int current;//= -1;
	
	//�ݷ���: ���� Ÿ���� �������� ������ �����ϱ� ���� �ڹ� ���̺귯��
	//Java���� �����͸� �����ϴ� �⺻���� �ڷᱸ������ �� ���� ��� �����ϰ� ���ϰ� ����ϱ� ���ؼ� �����ϴ� ��
	
	
	//���� �����͸� �����ϱ� ���� �ʼ� �ʵ�
	private int capacity; //��ü �뷮
	private int amount; //�߰� ������
	
	
	public ExamCollection() {
		capacity = 3;
		amount = 5;
		exams = new Exam[capacity]; // ������
		current = -1; // ������
	}

	public int size() {
		return current + 1;
	}

	public Exam get(int i) {		
		return exams[i];
	}

	public void add(Exam exam) {
		++current;
		
		//������ exam ���� �޾ƿͼ� �迭�� ���ʴ�� ����
		//���࿡ ������ ���ڶ�� ������ �÷��ش�.
		
		if(capacity <= current)
		{
			//���ο� ũ���� �迭(�����͸� �����ϰ� ����)�� ����� ��
			Exam[] temp = new Exam[capacity+amount];
			
			//exams�� ���� temp�� ����
			for(int i=0;i<capacity;i++)
				temp[i]=exams[i];
			
			//�̸�ǥ�� �ٲ��־���, ���ο� �迭�� �����Ǿ�� ��
			exams = temp;
			
			//exams = new Exam[capacity]�� capacity�� �þ ���ο� ������ �ٲ���
			capacity = capacity+amount;
		}
		
		exams[current] = exam;
	}

}
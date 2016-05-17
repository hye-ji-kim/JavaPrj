package collection.object;
public class ObjectCollection {
	//���������� ���
	
	private Object[] data;//= new Exam[3];
	private int current;//= -1;
	
	//���� �����͸� �����ϱ� ���� �ʼ� �ʵ�
	private int capacity; //��ü �뷮
	private int amount; //�߰� ������
	
	
	public ObjectCollection() {
		capacity = 3;
		amount = 5;
		data = new Object[capacity]; // ������
		current = -1; // ������
	}

	public int size() {
		return current + 1;
	}

	public Object get(int i) {		
		return data[i];
	}

	public void add(Object exam) {
		++current;
		
		//������ exam ���� �޾ƿͼ� �迭�� ���ʴ�� ����
		//���࿡ ������ ���ڶ�� ������ �÷��ش�.
		
		if(capacity <= current)
		{
			//���ο� ũ���� �迭(�����͸� �����ϰ� ����)�� ����� ��
			Object[] temp = new Object[capacity+amount];
			
			//exams�� ���� temp�� ����
			for(int i=0;i<capacity;i++)
				temp[i]=data[i];
			
			//�̸�ǥ�� �ٲ��־���, ���ο� �迭�� �����Ǿ�� ��
			data = temp;
			
			//exams = new Exam[capacity]�� capacity�� �þ ���ο� ������ �ٲ���
			capacity = capacity+amount;
		}
		
		data[current] = exam;
	}

}
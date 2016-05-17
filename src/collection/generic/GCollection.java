package collection.generic;
public class GCollection<T> {//�ڷ����� ���۳� ��, <T>
	//<����> ���۳��� �˷���
	
	//���׸�
	//�������� �������� ���� ��
	//�����Ϸ����� ���ø�, �ڷ��� �˷���
	//�����Ϸ��� �˾Ƽ� Ŭ���� ��������
	
	//���� �׸��� ����, �׷��� �����ڳ� �ڷ����� �׷� �� ����
	//���� = �������̽�
	//�ڷ��� = ������ ��
	
	//G=���ø�, �޶����� �κ��� �ִٸ� ������ ���ڴ�
	//���������� ���
	
	private T[] data;//= new Exam[3];
	private int current;//= -1;
	
	//���� �����͸� �����ϱ� ���� �ʼ� �ʵ�
	private int capacity; //��ü �뷮
	private int amount; //�߰� ������
	
	public GCollection() {
		capacity = 3;
		amount = 5;
		data = (T[]) new Object[capacity]; //Object�� ��ü�� ������ �ڿ� <T>������ ����ȯ
		//��ü ������ �κп��� T �� �� ����
		//C++������ ����
		//�������� �ǹ��ִ� ���׸�
		
		//new���� ���۳� �� �����
		//������
		current = -1; // ������
	}
	
	//��ø Ŭ����
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
		
		//������ exam ���� �޾ƿͼ� �迭�� ���ʴ�� ����
		//���࿡ ������ ���ڶ�� ������ �÷��ش�.
		
		if(capacity <= current)
		{
			//���ο� ũ���� �迭(�����͸� �����ϰ� ����)�� ����� ��
			T[] temp = (T[]) new Object[capacity+amount];
			
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


	public Iterator iterator() {
		
		return new Iterator();
	}

}
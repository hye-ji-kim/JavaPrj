package boxing;

public class Program {
	
	public static void add(Integer x){//�ڽ�
		++x;//�ڽ� ���� ���� ������
	}

	public static void main(String[] args) {
		
		Integer x = new Integer(3);
		add(x); //�ڽ��� ���� ������ ����, ��ڽ�
		System.out.println(x);
		//������ ���� X, ���� ���޵�
		//���� �Ұ���
		
		//Boxing: �⺻ Ÿ���� ��ü�� ���δ� ����
		//��� �����͸� �����ϰ� �ϰ� �����ϱ� ���� ���
		//���� �ڷ����� �ϰ� ������ ��������
		
		//Wrapping = Boxing
		//������ ��üȭ �ϴ� ������ �ʿ��ߴ�.
		
		//Object obj = new Integer(3);
		
		//�ڹ��� ��� ��ü�� Object
		
		//������ ���� �ڵ����� �ڽ��� 3�� �־� ������Ű�� ����
		//Object obj = 3;
		
		//Integer�� int�� �޶��
		//Integer x = 3; ->Boxing�ϰ� �� ������ �޸� �ö�, �δ㽺����
		
		/*Integer x=3;
		int y =4;
		Integer z=x.valueOf(3)+y;
		System.out.print(z);*/
		
		//x�� ��������(�ּ�)�̹Ƿ� 4�� ���� �� ����
		//x.valueOf(int) �߾�� ��
		//������ �ڵ����� unBoxing ����
		
	}

}

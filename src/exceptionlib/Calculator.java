package exceptionlib;

//�̰͵� ���͵� �ƴ�... ��ü���� X

public class Calculator {

	public static int add(int x, int y){
		int result = x+y;
		
		return result;
		
	}
	public static int sub(int x, int y){
		int result = x-y;
		
		return result;
	}
	public static int multi(int x, int y){
		int result = x*y;
		
		return result;
	}
	public static int div(int x, int y) throws �����γ������ܿ���, ������������ܿ���{//���� �ٽ� �ϰ� ��, ���ܰ� �������� �� �����ϱ� throws�� ��ǥ�� ����
		
		if(y==0)
			//������ ���� ���� ���� c++ ��� throw 1;
			//�ĺ��ڷμ� ��ü�� �̿��ϱ�� ��
			
			throw new �����γ������ܿ���();
			//��������~
			//exception�� �θ�Ŭ������ �ڵ� ����
			//������ �ĺ��ϱ� ���� ���� ��
		
		if(!(0<=x && x<=100))
			throw new ������������ܿ���();
		
		int result = x/y;
		
		return result;
	}

}

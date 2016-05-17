import java.util.Random;

public class Lotto2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] lotto = new int[6];
		//int bonus = 0;

		//�ߺ� �˻� �Է�
		for(int i=0; i<6; i++)
			{
			lotto[i] = rand.nextInt(45)+1;
			
			if(i>0) // i>0 �϶��� �ߺ��˻�
				{
				for( int j=0; j<i; j++)
					{
					if(lotto[i-j-1]==lotto[i])
						i -= 1;
					}
				}
			}
			
		//��ȣ���
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();

		//�����ϱ� �������� (ù��°�� �ι�° ���� �ٲ�)
		int temp; //���� ��ȯ�� �� �ִ� �ӽ� ��ó i<6�̸� 7��° ���� �ʿ�
		
		for(int j=0;j<5;j++){
			for(int i=0;i<5-j;i++)
				if(lotto[i]>lotto[i+1]){
					temp =lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1]= temp;
		}
			
		//��ȣ���
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();
		}
	}
}

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
public class ByteArrayInputOutputStream {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // ����Ʈ �迭�� �����͸� ����� �ϴµ� ���Ǵ� ��Ʈ��
    	// �ٸ� ������ ����� �ϱ� ���� �����͸� �ӽ÷� ����Ʈ �迭�� ��Ƽ� ��ȯ�ϴ� �۾��� ����
    	
    	//byte �迭�� �����͸� ����
    	byte[] inSource = {0,1,2,3,4,5,6,7,8,9}; 
        byte[] outSource = null;
        
        //��ü ����
        ByteArrayInputStream input = new ByteArrayInputStream(inSource);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
       
        // data�� 0���� �ʱ�ȭ
        int data = 0;
        
        //ByteArrayOutputStream�� ������ �Է��ϴ� ����
        while((data = input.read()) != -1)
        {
            output.write(data);
        }
        
        //ByteArrayOutputStream�� ��� �����͸� toByteArray�� ���
        outSource = output.toByteArray();
        
        System.out.println("Input Source :"+Arrays.toString(inSource));
        System.out.println("Output Source :"+ Arrays.toString(outSource));
    }
}
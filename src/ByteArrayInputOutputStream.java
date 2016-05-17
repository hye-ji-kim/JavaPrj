
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
public class ByteArrayInputOutputStream {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 바이트 배열에 데이터를 입출력 하는데 사용되는 스트림
    	// 다른 공간에 입출력 하기 전에 데이터를 임시로 바이트 배열에 담아서 변환하는 작업에 쓰임
    	
    	//byte 배열에 데이터를 담음
    	byte[] inSource = {0,1,2,3,4,5,6,7,8,9}; 
        byte[] outSource = null;
        
        //객체 선언
        ByteArrayInputStream input = new ByteArrayInputStream(inSource);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
       
        // data를 0으로 초기화
        int data = 0;
        
        //ByteArrayOutputStream에 데이터 입력하는 과정
        while((data = input.read()) != -1)
        {
            output.write(data);
        }
        
        //ByteArrayOutputStream에 담긴 데이터를 toByteArray로 출력
        outSource = output.toByteArray();
        
        System.out.println("Input Source :"+Arrays.toString(inSource));
        System.out.println("Output Source :"+ Arrays.toString(outSource));
    }
}
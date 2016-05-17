package exceptionlib;

//이것도 저것도 아닌... 객체지향 X

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
	public static int div(int x, int y) throws 영으로나눈예외오류, 범위를벗어난예외오류{//보고를 다시 하게 됨, 예외가 여러개일 수 있으니까 throws를 쉼표로 구분
		
		if(y==0)
			//영으로 나눈 예외 오류 c++ 방식 throw 1;
			//식별자로서 객체를 이용하기로 함
			
			throw new 영으로나눈예외오류();
			//던져던져~
			//exception을 부모클래스로 자동 설정
			//오류를 식별하기 위해 쓰인 것
		
		if(!(0<=x && x<=100))
			throw new 범위를벗어난예외오류();
		
		int result = x/y;
		
		return result;
	}

}

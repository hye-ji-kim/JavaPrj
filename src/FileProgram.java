import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		//합치기
		System.out.println("Beautiful"+" Flowers");
		System.out.println("Beautiful".concat(" Flowers"));
		
		//나누기
		String[] strs = "로또 : 1 20 30".split(" : "); //split이 new 선언함(배열 만들어줌) 나보다 똑똑함...
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//자르기
		"Hello".substring(2);
		
		//객체가 같은가 비교
		String name1 = "a";
		String name2 = "a"; //참조한 값이 같은가? 같은 객체를 참조하게 함
		String name3 = new String("a"); // 값은 같지만 새로운 객체를 비교하는 셈
		
		//문자 값을 비교
		System.out.println(name1==name2);
		System.out.println(name1.equals(name3));
		
		//문자열 찾기
		"Hello".indexOf("a");//a가 포함된 위치 인덱스
		System.out.println("Hello".indexOf("a"));

		// o의 위치를 찾아줘
		int idx = "Hello How are you".indexOf("o");
		System.out.println(idx);
		
		idx = "Hello How are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		idx = "Hello How are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		String filename = "file1.txt";
		idx= ("file1.txt".lastIndexOf(".")); // .앞의 문자 날림
		System.out.println(filename.substring(idx+1));
		
		String path ="C:\\20160223\\lotto.txt";
		idx= (path.lastIndexOf("\\"));
		System.out.println(path.substring(idx+1));
		
		//문자열 변환: 숫자 <-> 문자열
		int kor = Integer.parseInt("23");
		System.out.println(kor +2);
		
		String s =""+kor;
		//String s = String.valueOf(kor);
		System.out.println( s +"2");*/
		
		
		FileOutputStream fos = new FileOutputStream("C:\\20160223\\Hello.txt");
		PrintStream fout = new PrintStream(fos);
		fout.print("I can do it!");
		
		fout.close(); // 열었던 순서랑 반대로
		fos.close(); // 하부 자원에 대한 것들을 반환해야 할 때 close 사용
		
		System.out.println("입력 받아 볼까요?");
		
		FileInputStream fis = new FileInputStream("C:\\20160223\\Lotto.txt");
		Scanner fscan = new Scanner(fis);
		
		//앞의 문자열부터 하나씩 읽어오기 (스페이스는 버림)
		fscan.next();
		fscan.next();
		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();	
		//String str = fscan.nextLine(); 문자열을 읽어온다.
		
		//출력
		System.out.printf("n1: %d, n2: %d, n3:%d", n1, n2, n3);
		
		fscan.close();
		fis.close();
	}
}

//함수 모듈로 분리 하는 로또 프로그램

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto6 {
	public static void main(String[] args){
		int menu = inputMainMenu();
		int [][] lottos = new int [10][6];
		
		switch(menu)
		{
		case 1:
			// 생성할 개수 입력
			로또자동생성();
			
			break;
		case 2:
			// 수동 번호 입력
			로또수동생성();
			break;
		}
	}

	private static int inputMainMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void 로또수동생성() {
		// TODO Auto-generated method stub
		
	}

	private static void 로또자동생성() {
		// TODO Auto-generated method stub
		
		//리스트 만들기
		로또번호리스트();
	}

	private static void 로또번호리스트() {
		// TODO Auto-generated method stub
		
	}
}
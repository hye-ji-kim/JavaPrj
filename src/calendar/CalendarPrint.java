package calendar;

import java.util.Calendar;

public class CalendarPrint {

	// Calendar 인스턴스 생성
	Calendar cal = Calendar.getInstance();

	// 요일 표시 헤더
	private String[] calHeader = {"일","월","화","수","목","금","토"};
	// 날짜 데이터 배열
	private String[][] calDate = new String[6][7];

	private int width=calHeader.length; // 배열 가로 넓이
	private int startDay;   // 월 시작 요일
	private int lastDay;    // 월 마지막 날짜
	private int inputDate=1;  // 입력 날짜 
	int day;

	public int getDay() {
		return day;
	}

	// 생성자 : 데이터 생성
	public CalendarPrint(int year, int month, int day) throws Exception{

		// 입력 month(월) 은 1~12 사이의 값이다.
		if(month<1 || month>12){
			System.out.println("월은 1~12 사이의 숫자입니다.");
			throw new Exception();
		}else{
			//this.day = day;
			
			// Calendar에 년,월,일 셋팅
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month-1);
			cal.set(Calendar.DATE, 1);

			startDay = cal.get(Calendar.DAY_OF_WEEK); // 월 시작 요일 
			lastDay = cal.getActualMaximum(Calendar.DATE); // 월 마지막 날짜

			// 2차 배열에 날짜 입력
			int row = 0;
			for(int i=1; inputDate<=lastDay; i++){

				// 시작 요일이 오기전에는 공백 대입
				if(i<startDay) calDate[row][i-1]="";
				else{
					// 날짜 배열에 입력
					calDate[row][(i-1)%width]=Integer.toString(inputDate);
					inputDate++;

					// 가로 마지막 열에 오면 행 바꿈
					if(i%width==0) row++;
				}      
			}
		}
	}
	// 달력 출력
	public void printCal(){

		// 달력 헤더 출력 "일월화수목금토"
		for(int i=0; i<width; i++){
			System.out.print(calHeader[i]+"\t");
		}
		System.out.println();

		// 날짜 배열 출력
		int row=0;
		for(int j=1 ; j<lastDay+startDay; j++){
			if(calDate[row][(j-1)%width] != ""){
				
				//calDate[row][(j-1)%width]은 int 타입이 아님
				int value = Integer.parseInt(calDate[row][(j-1)%width]);
				
				if(this.day==value){
					System.out.print("<"+calDate[row][(j-1)%width]+">\t");
				}else{
					System.out.print(calDate[row][(j-1)%width]+"\t");
				}
			}
			else{
				System.out.print(calDate[row][(j-1)%width]+"\t");
			}

			if((j-1)%width==width-1){
				System.out.println();
				row++;
			}

		}
	}
}

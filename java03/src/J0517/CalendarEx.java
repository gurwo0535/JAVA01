package J0517;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		//컴퓨터는 월을 (0~11)로 인식 / +1을 해줘야함 
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		int hourofday = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		//MILLISECOND : 1000분의 1초 
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg+":"+ year+"-"+ month+"-"+ day+" ");
//		//dayofweek 1~7(일요일1~토요일7)
//		System.out.println(dayofweek);
//		System.out.println(Calendar.FRIDAY);
		
		//switch 문을 활용한 요일 호출 
		switch (dayofweek) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		default:
			break;
		}
		if (ampm == Calendar.AM) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		//hourofday : 24시간 기준 
		System.out.println("("+hourofday+"시)");
		System.out.print(hour+"시 "+minute+"분 ");
		System.out.println(second+"초 "+millisecond+"밀리초 ");
	}
	
	public static void main(String[] args) {
		//abstract 추상  class 는 new 연산자로 객체생성 불가 
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		//날짜 시간정보를 삭제
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY,20);
		firstDate.set(Calendar.MINUTE,30);
		printCalendar("처음 데이트한 날은 : ", firstDate);
		
	
	}
}

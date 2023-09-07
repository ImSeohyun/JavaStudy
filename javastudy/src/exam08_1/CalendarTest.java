package exam08_1;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		/*
		 * java.util.GregorianCalendar
		 * [time=1689921885122,
		 * areFieldsSet=true,
		 * areAllFieldsSet=true,
		 * lenient=true,
		 * zone=sun.util.calendar.ZoneInfo
		 * [id="Asia/Seoul",
		 * offset=32400000,
		 * dstSavings=0,
		 * useDaylight=false,
		 * transitions=30,
		 * lastRule=null],
		 * firstDayOfWeek=1,
		 * minimalDaysInFirstWeek=1,
		 * ERA=1,YEAR=2023,
		 * MONTH=6,
		 * WEEK_OF_YEAR=29,
		 * WEEK_OF_MONTH=4,
		 * DAY_OF_MONTH=21,
		 * DAY_OF_YEAR=202,
		 * DAY_OF_WEEK=6,
		 * DAY_OF_WEEK_IN_MONTH=3,
		 * AM_PM=1,HOUR=3,
		 * HOUR_OF_DAY=15,
		 * MINUTE=44,
		 * SECOND=45,
		 * MILLISECOND=122,
		 * ZONE_OFFSET=32400000,
		 * DST_OFFSET=0]
		 * 
		 */
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//기본 1월:0 12월:11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		//특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal.set(2014,8,1);
		System.out.println("년:" + cal2.get(Calendar.YEAR));
		 System.out.println("월:" + cal2.get(Calendar.MONTH)+1);
		 System.out.println("일:" + cal2.get(Calendar.DAY_OF_MONTH));		
	}
}

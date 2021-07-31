package TrabalhandoEmCalendario;

import java.util.Calendar;

public class CalendarExemplo007 {

	public static void main(String[] args) {
		Calendar agora = Calendar.getInstance();
		System.out.printf("%tc\n", agora);
		//dom. jul. 18 23:11:13 BRT 2021
		
		System.out.printf("%tF\n", agora);
		//2021-07-18
		
		System.out.printf("%tD\n", agora);
		//07/18/21
		
		System.out.printf("%tr\n", agora);
		//11:12:21 PM
		
		System.out.printf("%tT\n", agora);
		//23:12:21
		
	}

}

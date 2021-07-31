package TrabalhandoEmDatas;

import java.util.Date;

public class DateLongExemplo002 {

	public static void main(String[] args) {
	
		Long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);
		//1626653777697
		
		Date novaData = new Date(currentTimeMillis);
		
		System.out.println(novaData);
		
	}

}

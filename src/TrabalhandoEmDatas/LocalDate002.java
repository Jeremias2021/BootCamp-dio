package TrabalhandoEmDatas;

import java.time.LocalDate;

public class LocalDate002 {

	public static void main(String[] args) {
		LocalDate hoje =  LocalDate.now();
		
		LocalDate ontem = hoje.minusDays(1);
		
		System.out.println(hoje);
		//2021-07-20
		
		System.out.println(ontem);
		//2021-07-19

	}

}

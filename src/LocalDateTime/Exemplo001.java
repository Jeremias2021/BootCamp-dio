package LocalDateTime;

import java.time.LocalDateTime;

public class Exemplo001 {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		//2021-07-20T23:04:06.560091100
		
		
		LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
		
		System.out.println(futuro);
		//2021-07-23T00:04:18.560091100
	}

}

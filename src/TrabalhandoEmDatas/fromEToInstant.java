package TrabalhandoEmDatas;

import java.time.Instant;
import java.util.Date;

/** 
 * Exemplo de conversasao entre date e Instant
 */

public class fromEToInstant {
	public static void main(String[] args) {
	
		Date dataIncio = new Date(1513124807691L);
		System.out.println(dataIncio);
		
		
		Instant instant = dataIncio.toInstant();
		System.out.println(instant);
		

	}

}

package TrabalhandoEmDatas;

import java.util.Date;

public class AfterBeforeExemplo003 {

	public static void main(String[] args) {
		
		Date dataNoPassado = new Date(15131248076911L);
		
		Date dataNoFuturo = new Date(16131248076911L);
		
		//Comparando de a dataNoPassado é posterior a dataNoFuturo
		
		boolean isAfter = dataNoPassado.after(dataNoPassado);
		
		System.out.println(isAfter);
		//false
		
		//Comparando de a dataNoPassado é anterior a dataNoFuturo
		
		boolean isBefore = dataNoPassado.before(dataNoPassado);
		
		System.out.println(isBefore);
		//true
			
		}

}

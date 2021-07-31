package TrabalhandoEmDatas;

import java.util.Date;

/**
 Exemplo de utilizacao dos metodos compare e equals
 */
public class CompareEqualsExemplo004 {

	public static void main(String[] args) {
		Date dataNoPassado = new Date(15131248076911L);
		Date dataNoFuturo = new Date(1613124807691L);
		Date mesmaDataNoFuturo = new Date(1613124807691L);
		
		
		/**Comparando se as datas  sao iguais*/
		boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
		System.out.println(isEquals);
		
		/**Comparando uma data com outra*/
		int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
		int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
		int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
		
		System.out.println(compareCase1);
		System.out.println(compareCase2);
		System.out.println(compareCase3);
		
		

	}

}

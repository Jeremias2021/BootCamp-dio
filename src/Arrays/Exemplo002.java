package Arrays;

public class Exemplo002 {

	public static void main(String[] args) {
		
	int[][] meuArrayMulti = { {1, 2, 3, 4}, {5, 6, 7} };

	for (int i=0; i<meuArrayMulti.length; i++) {
		for (int j=0; j<meuArrayMulti.length; ++j) {
			System.out.println(meuArrayMulti[i][j]);
			}
		}
	
	}
	/**
	 * meuArrayMulti é um array com dois arrays como seus elementois 
	 */
}

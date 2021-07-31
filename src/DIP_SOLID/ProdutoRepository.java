package DIP_SOLID;

import java.util.ArrayList;
import java.util.List;

import SRP_SOLID.Produto;


public class ProdutoRepository {

	private DbConnection dbConnection;
	
	public ProdutoRepository(DbConnection dbConnection) {
		//this.dbConnection = new dbConnection ;
	}
	/**
	public List<DIP.problem.Produto> buscarProdutos() {
		//retornar a lista de produto de base de dados
		return new ArrayList<>();
	}
	
	public void salvarProduto(Produto produto) {
		//salva a lista de produtos na base de dados
	}
	*/
}

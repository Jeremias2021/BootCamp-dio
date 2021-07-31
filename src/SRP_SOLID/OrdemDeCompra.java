package SRP_SOLID;

import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public void  adicionaProduto(Produto produto) { produtos.add(produto);}
	
	public void removerProduto(Produto produto) {produtos.remove(produto);}
	/**
	public BigDecimal calcularTotal() {
		return produtos.stream()
			.map(Produto::getValor)
			.reduce(BigDecimal.ZERO, BigDecimal::add);	
	}
	*/
	public List<OrdemDeCompra> buscarOrdemDeCoompra(){
		//salva a lista de ordem de compra de base de dados 
		return new ArrayList<>();
	}
	
	public void salvarOrdemCompra() {
		//salva lista de produtos na base de dados
	}
	
	public void enviarEmail(String email) {
		//envia email de ordem de compra 
	}
	public void imprimirOrdemdeCompra() {
		//imprime a ordem de compra
	}

}

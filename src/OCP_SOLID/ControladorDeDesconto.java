package OCP_SOLID;

public class ControladorDeDesconto {
	
	public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
		descontoLivroInfantil.valorDescontoLivroInfantil();
	}
	
	public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAJuda descontoLivroAutoAjuda) {
		descontoLivroAutoAjuda.valorDescontoAutoAjuda();
	}
	
	public void adicionaDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao) {
		descontoLivroAcao.descontoLivroAcao();
	}

}

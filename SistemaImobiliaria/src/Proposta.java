import java.util.ArrayList;

public class Proposta {
	private static int geradorId;
	
	//Atributos
	private final int id;
	private final Imovel imovel;
	private final Cliente comprador;
	private final Proprietario vendedor;
	private Corretor corretorResponsavel;
	private ArrayList<Pagamento> formaDePagamento;
	private double precoProposta;
	
	//Construtores	
	public Proposta(Imovel imovel, Cliente comprador, Proprietario vendedor, Corretor corretorResponsavel, double precoProposta) {
		id = ++geradorId;
		formaDePagamento = new ArrayList<Pagamento>();
		this.imovel = imovel;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.corretorResponsavel = corretorResponsavel;
		this.precoProposta = precoProposta;
	}
	
	//Metodos
	public static int getGeradorId() {
		return geradorId;
	}
	
	public int getId() {
		return id;
	}
	
	public ArrayList<Pagamento> getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(ArrayList<Pagamento> formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public double getPrecoProposta() {
		return precoProposta;
	}

	public void setPrecoProposta(double precoProposta) {
		this.precoProposta = precoProposta;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public Proprietario getVendedor() {
		return vendedor;
	}

	public Corretor getCorretorResponsavel() {
		return corretorResponsavel;
	}
	
	public void setCorretorResponsavel(Corretor corretor) {
		this.corretorResponsavel = corretor;
	}
	
	private boolean verificarExistenciaPagamento(Pagamento p) { //Verifica se a forma de pagamento existe no ArrayList
		return formaDePagamento.contains(p);
	}
	
	public boolean adicionarPagamento(Pagamento p) {
		boolean logica = !verificarExistenciaPagamento(p) && imovel
			.getFormasPagamentoAceitas()
			.contains(p.getFormaPagamento());

		if (logica)
			return formaDePagamento.add(p);
		
		return false;
	}
	
	public boolean removerPagamento(Pagamento p) {
		return formaDePagamento.remove(p);
	}
}

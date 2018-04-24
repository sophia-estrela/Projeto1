import java.util.ArrayList;

/** Essa classe simula um banco de dados que sera posteriomente implementado*/
public class Imobiliaria {
	
	private ArrayList<Imovel> imoveis;
	private ArrayList<Cliente> clientes;
	private ArrayList<Corretor> corretores;
	private ArrayList<Proprietario> proprietarios;
	private ArrayList<Proposta> propostas;
	public Imobiliaria(){
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();
		corretores = new ArrayList<Corretor>();
		proprietarios = new ArrayList<Proprietario>();
		propostas = new ArrayList<Proposta>();
	}
	
	/**Metodos de adicao e remocao de infomacoes do banco de dados simulado*/
	
	public boolean adicionarImovel(Imovel imovel) {
		return imoveis.add(imovel);
	}

	public boolean removerImovel(Imovel imovel) {
		return imoveis.remove(imovel);
	}
	
	public boolean removerImovel(int idImovel) {
		for (Imovel imovel : imoveis) {
			if(imovel.getId()==idImovel) {
				return imoveis.remove(imovel);
			}
		}
		return false;
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		return clientes.add(cliente);
	}

	public boolean removerCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	public boolean removerCliente(int idCliente) {
		for (Cliente cliente : clientes) {
			if(cliente.getId()==idCliente) {
				return clientes.remove(cliente);
			}
		}
		return false;
	}
	
	public boolean adicionarCorretor(Corretor corretor) {
		return corretores.add(corretor);
	}

	public boolean removercorretor(Corretor corretor) {
		return corretores.remove(corretor);
	}
	
	public boolean removercorretor(int idCorretor) {
		for (Corretor corretor : corretores) {
			if(corretor.getId()==idCorretor) {
				return corretores.remove(corretor);
			}
		}
		return false;
	}
	
	public boolean adicionarProprietario(Proprietario proprietario) {
		return proprietarios.add(proprietario);
	}

	public boolean removerProprietario(Proprietario proprietario) {
		return proprietarios.remove(proprietario);
	}
	
	public boolean removerProprietario(int idProprietario) {
		for (Proprietario proprietario : proprietarios) {
			if(proprietario.getId()==idProprietario) {
				return proprietarios.remove(proprietario);
			}
		}
		return false;
	}
	
	public void finalizarProposta(Proposta proposta)
	{
		for(int i=0;i<this.propostas.size();i++)
		{
			if(this.propostas.get(i).equals(proposta))
			{
				this.propostas.get(i).setStatus(false);
			}
				
		}
	}
	
	public void finalizarProposta(int id)
	{
		for(int i=0;i<this.propostas.size();i++)
		{
			if(this.propostas.get(i).getId()==id)
			{
				this.propostas.get(i).setStatus(false);
			}
		}
		
	}


	/* bloco de getters e setters */
	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Corretor> getCorretores() {
		return corretores;
	}

	public void setCorretores(ArrayList<Corretor> corretores) {
		this.corretores = corretores;
	}

	public ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public void setProprietarios(ArrayList<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	public ArrayList<Proposta> getPropostas() {
		return propostas;
	}

	public void setPropostas(ArrayList<Proposta> propostas) {
		this.propostas = propostas;
	}



	
}
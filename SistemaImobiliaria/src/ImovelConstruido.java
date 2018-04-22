
public class ImovelConstruido /*TODO: uncomment this - extends Imovel*/ {
	private int vagasAutomovel;
	private int quantidadeBanheiros;
	private int quantidadeQuartos;
	private int quantidadeAndares;
	private int quantidadeSuites;
	private double areaConstruida;
	
	//TODO: add to the constructor the structure of the super class Imovel
	public ImovelConstruido(int vagasAutomovel, int quantidadeBanheiros, int quantidadeQuartos, int quantidadeAndares,
			int quantidadeSuites, double areaConstruida) {
		//super(Atibutes of super class);
		this.vagasAutomovel = vagasAutomovel;
		this.quantidadeBanheiros = quantidadeBanheiros;
		this.quantidadeQuartos = quantidadeQuartos;
		this.quantidadeAndares = quantidadeAndares;
		this.quantidadeSuites = quantidadeSuites;
		this.areaConstruida = areaConstruida;
	}

	public int getVagasAutomovel() {
		return vagasAutomovel;
	}

	public void setVagasAutomovel(int vagasAutomovel) {
		this.vagasAutomovel = vagasAutomovel;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public int getQuantidadeAndares() {
		return quantidadeAndares;
	}

	public void setQuantidadeAndares(int quantidadeAndares) {
		this.quantidadeAndares = quantidadeAndares;
	}

	public int getQuantidadeSuites() {
		return quantidadeSuites;
	}

	public void setQuantidadeSuites(int quantidadeSuites) {
		this.quantidadeSuites = quantidadeSuites;
	}

	public double getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	@Override
	public String toString() {
		return  super.toString() + ", NumeroVagasAutomovel=" + getVagasAutomovel() + ", QuantidadeBanheiros="
				+ getQuantidadeBanheiros() + ", QuantidadeQuartos=" + getQuantidadeQuartos()
				+ ", QuantidadeAndares=" + getQuantidadeAndares() + ", QuantidadeSuites="
				+ getQuantidadeSuites() + ", AreaConstruida= " + getAreaConstruida();
	}
	
	
}

package postogasolina;

public class Abastecimento {
	private double Qtd;
	private String Nome_Vendedor, Nome_Cliente, Combustivel, Forma_Pag, Data_Abs;
	
	public Abastecimento(String Nome_Vendedor, String Nome_Cliente, String Combustivel, Double Qtd, String Forma_Pag, String Data_Abs) {
		this.Nome_Vendedor=Nome_Vendedor;
		this.Nome_Cliente=Nome_Cliente;
		this.Combustivel=Combustivel;
		this.Qtd=Qtd;
		this.Forma_Pag=Forma_Pag;
		this.Data_Abs=Data_Abs;
	}
	
	public String getNome_Vendedor() {
		return Nome_Vendedor;
	}
	
	public String getNome_Cliente() {
		return Nome_Cliente;
	}
	
	public String getCombustivel() {
		return Combustivel;
	}
	
	public double getQtd() {
		return Qtd;
	}
	
	public String getForma_Pag() {
		return Forma_Pag;
	}
	
	public String getData_Abs() {
		return Data_Abs;
	}
}

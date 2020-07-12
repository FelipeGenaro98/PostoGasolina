package postogasolina;

public class Cliente {
	private int Matricula, Abastecimentos;
	private String Nome, CPF, DataNasc;
	
	public Cliente(int Matricula, String Nome, String CPF, String DataNasc, int Abastecimentos) {
		this.Matricula=Matricula;
		this.Nome=Nome;
		this.CPF=CPF;
		this.DataNasc=DataNasc;
		this.Abastecimentos=Abastecimentos;
		
		
		
	}
	
	public int getMatric() {
		return Matricula;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getCpf() {
		return CPF;
	}
	
	public String getData() {
		return DataNasc;
	}
	
	public int getAbastecimentos() {
		return Abastecimentos;
	}
}

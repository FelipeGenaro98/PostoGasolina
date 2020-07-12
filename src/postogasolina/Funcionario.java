package postogasolina;

public class Funcionario {
	private int Matricula;
	private String NvAcesso, Nome, CPF, DataNasc, Sexo;
	
	public Funcionario(int Matricula, String NvAcesso, String Nome, String CPF, String DataNasc, String Sexo) {
		this.Matricula=Matricula;
		this.NvAcesso=NvAcesso;
		this.Nome=Nome;
		this.CPF=CPF;
		this.DataNasc=DataNasc;
		this.Sexo=Sexo;
	}
	
	public int getMatric() {
		return Matricula;
	}
	
	public String getNvacesso() {
		return NvAcesso;
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
	
	public String getSexo() {
		return Sexo;
	}
}

package banco;
import java.util.List;

import banco.conta.Conta;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarClientes(List<Conta>contas){
		for(Conta conta: contas){
			System.out.println(conta);
		}
	}

}

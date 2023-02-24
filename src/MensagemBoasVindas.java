
public class MensagemBoasVindas {

	private String nomeUsuario = "Luis";

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public MensagemBoasVindas(){}
	
	public MensagemBoasVindas(String nomeUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
	}
	
	public String exibirMensagem() {
		System.out.println("Seja bem vindo à sua calculadora digital");
		return("Seja bem vindo à sua calculadora digital");
	}
	
	public String exibirMensagemComNome() {
		System.out.println("Seja bem vindo à sua calculadora digital! " + nomeUsuario);
		return ("Seja bem vindo à sua calculadora digital! " + nomeUsuario);
	}
}

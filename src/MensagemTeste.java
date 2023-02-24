import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemTeste {

	@Test
	public void testeExibirMensagem() {
		MensagemBoasVindas mensagem = new MensagemBoasVindas();
		String mensagemEsperada = "Seja bem vindo à sua calculadora digital";
		String resultadoReal = mensagem.exibirMensagem();
		assertEquals(mensagemEsperada, resultadoReal);
	}

	@Test
	public void testeMensagemNome() {
		MensagemBoasVindas mensagemComNome = new MensagemBoasVindas();
		String nomeUsuario = "Luis";
		String mensagemEsperada = ("Seja bem vindo à sua calculadora digital! " + nomeUsuario);
		String resultadoReal = mensagemComNome.exibirMensagemComNome();
		assertEquals(mensagemEsperada, resultadoReal);
	}
}

package regression.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import regression.test.runner.Executa;

public class BackgorundTest {
	
	// criar um ponteiro para class de métodos

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
		Executa.abrirNavegador();
	}

	@Given("informo o usuario {string}")
	public void informoOUsuario(String usuario) {
		//metodo.escrever(elemento,usuario)
	}

	@Given("informo a senha {string}")
	public void informoASenha(String senha) {
		//metodo.escrever(elemento,senha)
	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		//metodo.clicar(elemento)
	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		//validarMensagem
	}

	@Given("informo o usuario invalido {string}")
	public void informoOUsuarioInvalido(String string) {

	}

	@Given("informo a senha invalida {string}")
	public void informoASenhaInvalida(String string) {

	}

	@Then("login nao realizado")
	public void loginNaoRealizado() {

	}

	@Given("informo a senha valida {string}")
	public void informoASenhaValida(String string) {

	}

	@Then("login mensagem de usuario bloqueado")
	public void loginMensagemDeUsuarioBloqueado() {

	}

}

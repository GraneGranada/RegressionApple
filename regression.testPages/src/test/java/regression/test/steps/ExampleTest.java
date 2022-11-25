package regression.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import regression.test.runner.Executa;

public class ExampleTest {

	@Given("que acesso o site da escola")
	public void queAcessoOSiteDaEscola() {
		Executa.abrirNavegador();
	}

	@When("capturo o title")
	public void capturoOTitle() {

	}

	@Then("valido o title")
	public void validoOTitle() {

	}

}

package regression.test.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProdutoPage;
import regression.test.runner.Executa;

public class AdicionarProdutosApple {
	
	HomePage home = new HomePage();
	ProdutoPage mac = new ProdutoPage();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Given("que selecione Mac na home")
	public void queSelecioneMacNaHome() {
		home.selecionarCategoria("Iphone");

	}

	@Given("clicar em Macbook pro")
	public void clicarEmMacbookPro() {
		mac.selecionarProdutoMacPage("Iphone 14 pro");

	}

	@Given("selecionar macbook13")
	public void selecionarMacbook13() {

	}

	@Given("clicar em select")
	public void clicarEmSelect() {

	}

	@Given("clicar em add to bag")
	public void clicarEmAddToBag() {

	}

	@When("clicar em review bag")
	public void clicarEmReviewBag() {

	}

	@Then("produto adicionado na bag")
	public void produtoAdicionadoNaBag() {

	}

}

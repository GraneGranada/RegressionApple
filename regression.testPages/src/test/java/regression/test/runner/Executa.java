package regression.test.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",// documentação
		glue = "regression.test.steps", //implementa documentação
		tags = "@adicionarprodutos",// qual tag será executada
		monochrome = true,// não aparecer caracteres especiais no console %$#
		dryRun = false,//coloca true para plenajar e false para executar
		plugin = {"pretty","html:target/cucumber-report.html"}, //formatar o console do junit para ficar
		//igual ao cucumber | html:target -> gerar um report html
		snippets = SnippetType.CAMELCASE // para gerar metodos no padrao Java ao invés de colocar
		// _ exemplo cadastrarCliente() se nao colocar fica cadastrar_cliente()
		)

public class Executa extends DriversFactory{
	
	public static void abrirNavegador() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.apple.com/");
	}

}

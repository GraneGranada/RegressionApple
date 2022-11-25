package pages;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class ProdutoPage extends DriversFactory {

	public void selecionarProdutoMacPage(String produto) {
		
		//Metodos metodos = new Metodos();

		if (produto.equalsIgnoreCase("iphone 14 pro")) {
			produto = "iphone-14-pro";
		}

		if (produto.equalsIgnoreCase("Macbook pro")) {
			produto = "macbook-pro";
		}

		if (produto.equalsIgnoreCase("Macbook air")) {
			produto = "macbook-air";
		}

		if (produto.equalsIgnoreCase("Imac 24")) {
			produto = "imac-24";
		}
 
		//implementar o metodo click()
		driver.findElement(By.xpath("//a[@href='/" + produto + "/']")).click();

	}

}

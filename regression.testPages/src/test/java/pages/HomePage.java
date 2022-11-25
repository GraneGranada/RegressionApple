package pages;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class HomePage extends DriversFactory {

	public void selecionarCategoria(String produto) {
		String produtoSelecionado = produto.toLowerCase();

		driver.findElement(By.xpath("//ul[@class='ac-gn-list']//a[@data-analytics-title='" + produtoSelecionado + "']")).click();

	}

}

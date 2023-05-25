package org.curso.automacao.testes.sistemas.bdd;

import org.openqa.selenium.chrome.ChromeOptions;

public class CommomHelper {
	
	public static ChromeOptions getChromeOptions() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		
		return chromeOptions;
		
	}
	
	public static ChromeOptions getChromeOptionsForContainer() {
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--verbose");

		chromeOptions.setCapability("pageLoadStrategy", "eager");
		
		return chromeOptions;
	}

}

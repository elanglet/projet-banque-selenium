package fr.formation.selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebScenarioNavigationTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void navigationFirefox() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		
		// Test name: SC1
		// Step # | name | target | value
		// 1 | open | /banque-web-1.0.0-RELEASE/ |
		driver.get("http://localhost:9000/banque-web/");
		// 3 | assertText | css=h2 | Bienvenue sur votre Banque en ligne !!!
		assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Bienvenue sur votre Banque en ligne !!!"));
		// 4 | click | linkText=Nous Contacter |
		driver.findElement(By.linkText("Nous Contacter")).click();
		// 5 | assertText | css=h3 | Nous contacter
		assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Nous Contacter"));
		// 6 | click | linkText=Accès client |
		driver.findElement(By.linkText("Accès client")).click();
		// 7 | assertText | css=h3 | Identification Client
		assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Identification Client"));
	}
	
	@Test
	public void navigationChrome() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		
		// Test name: SC1
		// Step # | name | target | value
		// 1 | open | /banque-web-1.0.0-RELEASE/ |
		driver.get("http://localhost:9000/banque-web/");
		// 3 | assertText | css=h2 | Bienvenue sur votre Banque en ligne !!!
		assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Bienvenue sur votre Banque en ligne !!!"));
		// 4 | click | linkText=Nous Contacter |
		driver.findElement(By.linkText("Nous Contacter")).click();
		// 5 | assertText | css=h3 | Nous contacter
		assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Nous Contacter"));
		// 6 | click | linkText=Accès client |
		driver.findElement(By.linkText("Accès client")).click();
		// 7 | assertText | css=h3 | Identification Client
		assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Identification Client"));
	}
}

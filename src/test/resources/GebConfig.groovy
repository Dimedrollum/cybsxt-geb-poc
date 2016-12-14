/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

driver = { new FirefoxDriver() }

//baseUrl = "http://www.gebish.org"
baseUrl = "https://apparel-uk.local:9002/yacceleratorstorefront/en/"
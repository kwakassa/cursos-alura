package br.alura.selenium.cap1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TesteAutomatizado {
	private static final String URL_FIREFOX = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";//"C:\\c096489\\pgrms\\FirefoxPortable51\\FirefoxPortable.exe"
	public static void main(String[] args) throws IOException {
		String current = new File(".").getCanonicalPath();
        System.out.println("Current dir:"+current);
        String geckodriverPath = current + File.separator+"driver"+File.separator+"geckodriver.exe";
        System.out.println(geckodriverPath);
		System.setProperty("webdriver.firefox.marionette", geckodriverPath);
		//firefoxKillProcess();
		FirefoxProfile profile = getFireFoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		FirefoxBinary ffBinary = new FirefoxBinary(new File(URL_FIREFOX));
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(ffBinary);
		firefoxOptions.setProfile(profile);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("Caelum");
		campoDeTexto.submit();
	}

	private static FirefoxProfile getFireFoxProfile() {
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.useDownloadDir", true);
		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference("browser.download.dir", URL_FIREFOX);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
		firefoxProfile.setPreference("browser.download.manager.useWindow", false);
		firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
		firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
		System.out.println("Firefox Profile Vers\u00e3o: 2.23");
		return firefoxProfile;

	}

	private static void firefoxKillProcess() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		} catch (IOException e) {
			System.out.println("Erro ao finalizar processo do Firefox!");
		}
	}
}

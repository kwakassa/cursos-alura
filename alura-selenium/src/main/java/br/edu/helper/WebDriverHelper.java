package br.edu.helper;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverHelper {
	private static final Logger logger = Logger.getLogger(WebDriverHelper.class);
	private static final String URL_FIREFOX = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";//"C:\\c096489\\pgrms\\FirefoxPortable51\\FirefoxPortable.exe"
	private WebDriverHelper me = new WebDriverHelper();
	
	private WebDriverHelper() {}
	
	public WebDriverHelper getInstance(){
		return this.me;
	}
	
	public void killAllFirefoxProcess() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		} catch (IOException e) {
			logger.error("Erro ao finalizar processo do Firefox!");
		}
	}
	
	private FirefoxProfile getFireFoxProfile() {
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
}

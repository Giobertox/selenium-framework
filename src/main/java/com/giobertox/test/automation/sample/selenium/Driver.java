package com.giobertox.test.automation.sample.selenium;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class Driver {
  private static final String ROOT_URL_ADDRESS = "http://www.meganexus.com";

  // private static final String SELENIUM_SERVER_URL = "http://127.0.0.1:5555/wd/hub";

  private static final WebDriver INSTANCE;

  private Driver() {}

  public static WebDriver getInstance() {
    return INSTANCE;
  }


  static {
    try {
      // if(driverType.e)
      DesiredCapabilities desiredCapabilities = setupDebugLogPreferences();
      // If launched with Local Eclipse Selenium , the one in the project
      // use the following line ...
      // BEFORE WAS System.setProperty("webdriver.gecko.driver", "G:\\Selenium\\Firefox
      // driver\\geckodriver.exe");
      System.setProperty("webdriver.gecko.driver", ".\\resources\\geckodriver.exe");
      INSTANCE = new FirefoxDriver(); // (desiredCapabilities);
      // INSTANCE = new ChromeDriver(desiredCapabilities);
      // ...instead if launched with remote Selenium Server otherwise,
      // uncomment the following 3 lines
      // INSTANCE = new FirefoxDriver(desiredCapabilities);
      // {
      // INSTANCE = new RemoteWebDriver(new URL(SELENIUM_SERVER_URL),
      // DesiredCapabilities.firefox());
      // }
      // FirefoxProfile profile = new FirefoxProfile();
      // profile.setPreference("network.proxy.type", 0);
      // profile.setPreference("security.ssl3.dhe_rsa_aes_128_sha", false);
      // profile.setPreference("security.ssl3.dhe_rsa_aes_256_sha", false);
      INSTANCE.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    } catch (Exception e) {
      throw new RuntimeException("Oh, an error occurred when instantiating the WebDriver!", e);
    }
  }

  private static DesiredCapabilities setupDebugLogPreferences() {
    LoggingPreferences logs = new LoggingPreferences();
    logs.enable(LogType.BROWSER, Level.ALL);
    logs.enable(LogType.CLIENT, Level.ALL);
    logs.enable(LogType.DRIVER, Level.ALL);
    logs.enable(LogType.PERFORMANCE, Level.ALL);
    logs.enable(LogType.PROFILER, Level.ALL);
    logs.enable(LogType.SERVER, Level.ALL);

    DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
    desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
    return desiredCapabilities;
  }

  public static String getRootUrlAddress() {
    return ROOT_URL_ADDRESS;
  }

  public static void wait(final int milliseconds) throws InterruptedException {
    Thread.sleep(milliseconds);
  }

}

package com.saucedemo.steps.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*"); // 👈 clave para evitar errores recientes

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }
}

/*serenity {
  encoding = "UTF-8"
  compress.filenames = true
  take.screenshots = FOR_EACH_ACTION
}

webdriver {
  driver = firefox
  autodownload = true
  capabilities {
    "moz:firefoxOptions": {
      "args": ["--start-maximized", "--no-sandbox", "--lang=es", "--disable-popup-blocking", "--disable-download-notification",
        "--ignore-certificate-errors", "--allow-running-insecure-content", "--disable-translate", "--always-authorize-plugins",
        "--disable-extensions"]
    }

  }
}*/
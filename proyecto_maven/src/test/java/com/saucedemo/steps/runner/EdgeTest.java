package com.saucedemo.steps.runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup(); // 👈 esto lo descarga automáticamente
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}


package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {

    @BeforeClass
    public static void setup() {
        System.out.println("setup Calisti");
    }
    @Test
    public void test1() {
        System.out.println("Test 1 Calisti");
    }
    @Test
    public void test2() {
        System.out.println("Test 1 Calisti");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("tearDown Calisti");
    }
}

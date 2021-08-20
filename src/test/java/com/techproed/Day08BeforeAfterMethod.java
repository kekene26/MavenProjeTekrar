package com.techproed;

import org.junit.*;

public class Day08BeforeAfterMethod {


    @BeforeClass
    public static void setup () {
        System.out.println("setup calisti");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("tearDown Calisti");
    }
    @Before
    public void method () {
        System.out.println("method calisti");
    }
    @Test
    public void test1() {
        System.out.println("Test 1 Calisti");
    }
    @Test
    public void test2() {
        System.out.println("Test 2 Calisti");
    }
    @After
    public void tesrDownmethod() {
        System.out.println("tesrDownmethod Calisti");
    }
}

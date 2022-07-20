package com.readDataFromCommand;

import org.testng.annotations.Test;

public class ToReadTheDataFromCommandTest {
@Test
public static void accessData() {
	String browser = System.getProperty("browser");
	String url = System.getProperty("url");
	System.out.println(browser);
	System.out.println(url);
	
}
}

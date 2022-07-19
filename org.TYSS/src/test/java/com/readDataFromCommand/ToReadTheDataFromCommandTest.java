package com.readDataFromCommand;

import org.testng.annotations.Test;

public class ToReadTheDataFromCommandTest {
@Test
public static void accessData() {
	String name = System.getProperty("name");
	String branch = System.getProperty("Branch");
	System.out.println(name);
	System.out.println(branch);
	
}
}

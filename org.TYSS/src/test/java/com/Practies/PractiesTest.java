package com.Practies;

import org.testng.annotations.Test;

public class PractiesTest {
    @Test (priority = 1)
	public static void test() {
		System.out.println("Test_1 from practiesTest ");
	}
    @Test
    public static void Test1() {
    	System.out.println("Test_2 from practiesTest");
    }
    
    @Test
    public static void Test2() {
    	System.out.println("Test_3 from practiesTest");
    }
}

package com.Practies;

import org.testng.annotations.Test;

public class PractiesTest1 {
    @Test (priority = 1)
	public static void Test() {
		System.out.println("Test_1 from practiesTest1 ");
    }
    
    @Test
    public static void Test1() {
    	System.out.println("Test_2 from practiesTest1");
	    //i don't want to  change anything.
    	//changed..
    }
    
    @Test
    public static void Test2() {
    	System.out.println("Test_3 from practiesTest1");
    }
 
  @Test
	public static void test() {
		System.out.println("Test_1 from PractiesTest1");
		//commit change
	}
  @Test
  public static void test1() {
	  System.out.println("Test_2 from PractiesTest1");
	  //commited 
  }
  
  @Test
  public static void test2() {
	  System.out.println("Test_3 from PractiesTest1");
  }
}

package com.jobfair2015.app;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for simple GreetingTest.
 */
public class GreetingTest{
		
	@Test
	public void sample(){
		assertTrue(Greeting.greetWorld().equals("Hello World"));
	}	
}

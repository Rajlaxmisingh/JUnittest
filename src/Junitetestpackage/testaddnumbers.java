package Junitetestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		Junitfunctions JUnit=new Junitfunctions();
		int result=JUnit.addNumbers(100, 200);
		assertEquals(300,result);
		
	}

}

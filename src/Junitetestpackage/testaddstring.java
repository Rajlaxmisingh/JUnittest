package Junitetestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		Junitfunctions JUnit=new Junitfunctions();
		String result=JUnit.addString("Raj","Laxmi");
		assertEquals("RajLaxmi",result);
	}

}

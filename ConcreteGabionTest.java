package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcreteGabionTest {

	@Test
	public void test() {
		ConcreteGabion cg = new ConcreteGabion();
		
		//Pass
		assertEquals("Pass", 1, cg.getHealth());
		
		//Fail
		assertEquals("Pass", 0, cg.getHealth());
	}

}

package function;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import function.calc;
public class calcTest {
calc c;
	@Before
	public void setUp() throws Exception {
c = new calc();	
}

	@Test
	public void testgetResult() {
	assertEquals("greater than 200",c.getResult(200,200))	;
	}

}

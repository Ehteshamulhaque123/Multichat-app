package function;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class funcTest {
func f;
	@Before
	public void setUp() throws Exception {
	f = new func();
	}

	@Test
	public void test() {
  assertEquals(1040,f.total(10));
	}

}

package function;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
Palindrome p;
	@Before
	public void setUp() throws Exception {
p = new Palindrome();
	}

	@Test
	public void test() {
	assertEquals("dcba", p.pal("a","b","c","d"))	;
	}

}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	@Test
	public void helloStatic() {
		HelloWorld.helloStatic();
	}

	@Test
	public void minus() {
		final var helloWorld = new HelloWorld();
		assertEquals(-336, helloWorld.minus(1, 337));
		assertEquals(1337, helloWorld.minus(1, 337));
	}

}
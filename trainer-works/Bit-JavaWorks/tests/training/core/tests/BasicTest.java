package training.core.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import training.basics.SampleBL;

class BasicTest {

	SampleBL sbl = null;
	
	
	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("Hi i'm in before all... ");
	}
	
	@AfterAll
	public static void tearDownAfterAll() {
		System.out.println("hi i'm from after all... ");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("i'm in before each ");
		sbl = new SampleBL(); 
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After each called... ");
	}
	
	@Test
	void checktest() {
		 assertEquals(true, sbl.check());
	}

	@Disabled
	@Test
	void checkFailtest() {
		assertEquals(false, sbl.check());
	}

	@Test
	public void checkStringTest() {
		String name ="Naveen";
		assertEquals("Hi " + name, sbl.sayHi(name));
	}
	
	
	@DisplayName(value="MyTimOutCase")
	@Test
	public void checkTimeOutTest() {
		assertTimeout(Duration.ofMillis(1000), ()-> sbl.check());
	}
	
	@DisplayName(value="My Exception Test Case")
	@Test
	public void checkExceptionTest() {
		assertThrows(RuntimeException.class, ()-> sbl.throwException());
	}

	
	@DisplayName(value="My Exception Test Case Failed Case ")
	@Test
	public void checkExceptionFailedTest() {
		 sbl.throwException() ; 
	}
}

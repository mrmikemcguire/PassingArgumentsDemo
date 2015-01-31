import static org.junit.Assert.*;
import org.junit.Test;

public class PassingArgumentsDemoTest extends PassingArgumentsDemo
	{

	@Test
	public void convertToPintsTest()
		{
		assertEquals("Result should have been 4",4, convertToPints(2), 0.1);
		}

	@Test
	public void convertToFluidOuncesTest()
		{
		assertEquals(32, convertToFluidOunces(2), 0.1);
		}
	
	@Test
	public void convertToMilliliters()
		{
		assertEquals(60, convertToMilliliters(2), 1.0);
		}
	}

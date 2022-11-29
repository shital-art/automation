package automationPracticeScenario;

import org.testng.annotations.Test;

public class PrioritySetProgram {
	@Test(priority=1 ,invocationCount=1)//second run
public void testA()
{
	System.out.println("testA");
}
	@Test(priority=2,invocationCount=0)//skip this test
	public void testB()
	{
		System.out.println("testB");
	}
	@Test(priority=0,invocationCount=3)//first run count 3
	public void testc() {
		System.out.println("testC");
	}
}

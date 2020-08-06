package com.actitime.timetrack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void runTest()
	{
		Reporter.log("successfully running 1",true);
		Reporter.log("successfully running 2",true);
		Reporter.log("successfully running 3",true);
	}
}

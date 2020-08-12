package com.actime.testtrack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void runTest2()
	{
		Reporter.log("successfully running  1",true);
		Reporter.log("successfully running 2",true);
		Reporter.log("successfully running 3",true);
		Reporter.log("successfully running 4",true);
		Reporter.log("successfully running 5",true);
	}

}

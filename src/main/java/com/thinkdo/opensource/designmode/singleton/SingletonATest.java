package com.thinkdo.opensource.designmode.singleton;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class SingletonATest extends TestCase {
	

	@Override
	public TestResult run() {
		// TODO Auto-generated method stub
		return super.run();
	}

	@Override
	protected void runTest() throws Throwable {
		for(int i=0;i<200;i++){
			System.out.println(SingletonC.getInstance()); 
		}
	}
	
	
}

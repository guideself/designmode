package com.thinkdo.opensource.designmode.simplefactory;

import junit.framework.TestCase;

public class FruitFactoryTest extends TestCase {

	public void testGetFruit() {
		String fruit = FruitFactory.getFruit().getFruit();
		System.out.println(fruit); 
	}

}

package com.thinkdo.opensource.designmode.abstractfactory.client;

import com.thinkdo.opensource.designmode.abstractfactory.service.pillow.BigPillow;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillow.PillowCreator;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillow.SmallPillow;

public class Purchase {
	
	public static void buyBigPillow(){
		PillowCreator creator = new BigPillow();
		creator.createPillCore().createPillCore();
		creator.createPillowCase().createPillowCase();
	}
	
	public static void buySmallPillow(){
		PillowCreator creator = new SmallPillow();
		creator.createPillCore().createPillCore();
		creator.createPillowCase().createPillowCase();
	}
	
}

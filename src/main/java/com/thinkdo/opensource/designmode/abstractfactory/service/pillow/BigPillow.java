package com.thinkdo.opensource.designmode.abstractfactory.service.pillow;

import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcase.BigPillowCase;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcase.PillowCase;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcore.BigPillowCore;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcore.PillowCore;

/**
 * 方案一，大枕头
 * @author Administrator
 *
 */
public class BigPillow implements PillowCreator {
	
	public PillowCore createPillCore() {
		return new BigPillowCore();
	}

	public PillowCase createPillowCase() {
		return new BigPillowCase();
	}

}

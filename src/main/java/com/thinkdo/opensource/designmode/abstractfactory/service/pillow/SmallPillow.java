package com.thinkdo.opensource.designmode.abstractfactory.service.pillow;

import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcase.PillowCase;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcase.SmallPillowCase;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcore.PillowCore;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcore.SmallPillowCore;

/**
 * 方案二，小枕头
 * @author Administrator
 *
 */
public class SmallPillow implements PillowCreator {

	public PillowCore createPillCore() {
		return new SmallPillowCore();
	}

	public PillowCase createPillowCase() {
		return new SmallPillowCase();
	}

}

package com.thinkdo.opensource.designmode.abstractfactory.service.pillow;

import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcase.PillowCase;
import com.thinkdo.opensource.designmode.abstractfactory.service.pillowcore.PillowCore;

/**
 * 生产一个枕头（包含枕芯和枕套），这2部分有大小约束关系，所以这里要将它们放在同一个工厂接口中
 * 这是一个抽象工厂接口
 * @author Administrator
 *
 */
public interface PillowCreator {
	
	PillowCore createPillCore();
	
	PillowCase createPillowCase();
	
}

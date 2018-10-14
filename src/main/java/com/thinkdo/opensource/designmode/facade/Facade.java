package com.thinkdo.opensource.designmode.facade;

import com.thinkdo.opensource.designmode.facade.eat.EatEgg;
import com.thinkdo.opensource.designmode.facade.eat.EatRice;
import com.thinkdo.opensource.designmode.facade.exercise.Jump;
import com.thinkdo.opensource.designmode.facade.exercise.Run;

/**
 * 外观模式
 * @author Administrator
 *
 */
public class Facade {

	private Facade() {
		super();
	}
	
	/**
	 * 外观类提供给外部的接口，屏蔽了吃东西内部细节实现
	 */
	public static void eatSupper(){
		//这里的实例可以用工厂模式来创建
		new EatEgg().eat();
		new EatRice().eat();	
		new Run().exercise();
	}
	
	/**
	 * 也可以客户端直接访问内部的某一个模块
	 */
	public static void jump(){
		new Jump().exercise();
	}
	
}

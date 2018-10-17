package com.thinkdo.opensource.designmode.singleton;

/**
 * 饿汉式，不存在线程安全问题，使用了空间换时间的方式
 * @author Administrator
 *
 */
public class SingletonA {

	private SingletonA() {
		super();
	}
	
	private static SingletonA instance = new SingletonA();
	
	public static SingletonA getInstance(){
		return instance;
	}
	
}

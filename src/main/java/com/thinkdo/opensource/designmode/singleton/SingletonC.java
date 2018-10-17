package com.thinkdo.opensource.designmode.singleton;

/**
 * 前面提供的2个单例模式都存在缺陷；现在采用静态内部类+饿汉式的方式可以规避这些缺陷
 * @author Administrator
 *
 */
public class SingletonC {
	
	private SingletonC() {
		super();
	}

	private static class SingletonHolder{
		//静态初始化，由jvm来保证线程安全
		private static SingletonC	instance = new SingletonC();
	}
	
	public static SingletonC getInstance(){
		return SingletonHolder.instance;
	}
	
}

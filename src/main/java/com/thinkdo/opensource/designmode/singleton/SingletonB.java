package com.thinkdo.opensource.designmode.singleton;

/**
 * 濑汉式，如果不加同步锁，会存在线程安全问题。使用了时间换空间的方式，只是在要用到时创建，节省资源
 * @author Administrator
 *
 */
public class SingletonB {
	
	private volatile static SingletonB instance = null;

	private SingletonB() {
		super();
	}

	public static SingletonB getInstance(){
		if(instance==null){
			synchronized (SingletonB.class) {
				if(instance==null){
					instance = new SingletonB(); 
				}
			}
		}
		return instance; 
	}
	
}

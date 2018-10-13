package com.thinkdo.opensource.designmode.simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 简单工厂模式
 * @author Administrator
 *
 */
public class FruitFactory {

	private FruitFactory() {
		super();
	}
	
	/**
	 * 读取配置文件，创建实例
	 * @return
	 */
	public static Fruit getFruit(){
		Properties p = new Properties();
		InputStream inStream = FruitFactory.class.getResourceAsStream("simplefactory.properties");
		try {
			p.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(inStream!=null){
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			Fruit fruit = (Fruit) Class.forName(p.getProperty("Impl")).newInstance();
			return fruit;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null; 
	}
	
}

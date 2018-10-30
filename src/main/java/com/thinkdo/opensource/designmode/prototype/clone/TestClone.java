package com.thinkdo.opensource.designmode.prototype.clone;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person();
		Address address = new Address();
		address.setCountry("china");
		address.setRegion("wuhan");
		person.setAddress(address);
		person.setAge(12);
		person.setName("zhangs");
		person.setSex("男");
		
		Person cloneP = (Person) person.clone();
		cloneP.setName("liwang");
		cloneP.getAddress().setCountry("American");
		
		System.out.println(person.getName());
		System.out.println(cloneP.getName());
		System.out.println(person.getAddress().getCountry());
		System.out.println(cloneP.getAddress().getCountry());
		
		/**输出结果如下，可以看到虽然实现了Cloneable接口，但是这里由于Person对象中有引用类型的属性Address,但是在person的clone方法中没有递归的调用clone
		 * 导致出现浅拷贝，拷贝出来的person中的address与之前的person还是共有同一个内存地址address
			zhangs
			liwang
			American
			American
		 */
		
	}
}	

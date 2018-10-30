package com.thinkdo.opensource.designmode.prototype.clone;

//要理解原型模式，就要先看克隆方法
public class Person implements Cloneable{
	
	private String name;
	
	private String sex;
	
	private int age;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//		由于有引用属性，这个方法需要重写
		Person person = (Person) super.clone();
		Address address = (Address) this.address.clone(); 
		person.setAddress(address);
		return person;
	}
	
}

package com.thinkdo.opensource.designmode.builder.car;

public class Car {
	private String wheel;
	
	private String motor;
	
	private String gasoline;
	
	public void createCar(){
		System.out.println("car-->"+wheel+","+motor+","+gasoline);
	}
	
	//先生成构建器，然后使用构建器的build方法生成构建的对象
	private Car(CarBuilder builder) {
		this.wheel = builder.wheel;
		this.motor = builder.motor;
		this.gasoline = builder.gasoline;
	}

	public String getWheel() {
		return wheel;
	}

	public String getMotor() {
		return motor;
	}

	public String getGasoline() {
		return gasoline;
	}

	//构建器
	public static class CarBuilder{
		private String wheel;
		
		private String motor;
		
		private String gasoline;
		
		public Car build(){
			if(wheel==null){
				throw new IllegalArgumentException("必须要有轮子");
			}
			if(motor==null){
				throw new IllegalArgumentException("必须要有发动机");
			}
			if(gasoline==null){
				throw new IllegalArgumentException("必须要有汽油");
			}
			return new Car(this);
		}

		public CarBuilder(String wheel, String motor, String gasoline) {
			super();
			this.wheel = wheel;
			this.motor = motor;
			this.gasoline = gasoline;
		}

		public CarBuilder setWheel(String wheel) {
			this.wheel = wheel;
			return this;
		}

		public CarBuilder setMotor(String motor) {
			this.motor = motor;
			return this;
		}

		public CarBuilder setGasoline(String gasoline) {
			this.gasoline = gasoline;
			return this;
		}
	}
}

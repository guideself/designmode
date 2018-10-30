package com.thinkdo.opensource.designmode.builder.car;

import com.thinkdo.opensource.designmode.builder.car.Car.CarBuilder;

import junit.framework.TestCase;

public class CarTest extends TestCase {

	public void testCreateCar() {
		String gasoline = null;
		String wheel = null;
		String motor = null;
		CarBuilder carBuilder = new Car.CarBuilder(wheel, motor, gasoline);
		gasoline="汽油";
		wheel="轮子";
//		motor="发动机";
		Car car = carBuilder.setGasoline(gasoline).setMotor(motor).setWheel(wheel).build();
		car.createCar();
	}

}

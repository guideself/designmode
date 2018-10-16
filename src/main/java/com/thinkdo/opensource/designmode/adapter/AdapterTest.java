package com.thinkdo.opensource.designmode.adapter;

import junit.framework.TestCase;

public class AdapterTest extends TestCase {

	public void testIsUsb() {
		Ps2Service ps2Service = new Ps2ServiceImpl();
		Adapter adapter = new Adapter(ps2Service); 
		String usb = adapter.isUsb();
		System.out.println(usb); 
	}

	public void testIsPs2() {
		UsbService usbService = new UsbServiceImpl();
		Adapter adapter = new Adapter(usbService); 
		String ps2 = adapter.isPs2();
		System.out.println(ps2); 
	}

}

package com.thinkdo.opensource.designmode.adapter;


/**
 * 双向适配器，可以将ps2和usb互相转换
 * ps2转usb,持有usb对象
 * usb转ps2，持有ps2对象
 * @author Administrator
 *
 */
public class Adapter implements Ps2Service,UsbService{
	
	private Ps2Service ps2Service;
	
	private UsbService usbService;

	public Adapter(UsbService usbService) {
		super();
		this.usbService = usbService;
	}

	public Adapter(Ps2Service ps2Service) {
		super();
		this.ps2Service = ps2Service;
	}

	public Adapter(Ps2Service ps2Service, UsbService usbService) {
		super();
		this.ps2Service = ps2Service;
		this.usbService = usbService;
	}

	public String isUsb() {
		return ps2Service.isPs2();
	}

	public String isPs2() {
		return usbService.isUsb();
	}
	
}

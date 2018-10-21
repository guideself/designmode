package com.thinkdo.opensource.designmode.factorymethod;

import com.thinkdo.opensource.designmode.factorymethod.method.PlaneToBeijin;
import com.thinkdo.opensource.designmode.factorymethod.method.ToBeijin;
import com.thinkdo.opensource.designmode.factorymethod.method.TrainToBeijin;

public class BeijinTourism {
	
	public static void trace(int type){
		ToBeijin toBeijin = factorymethod(type);
		toBeijin.trace();
	}
	
	private static ToBeijin factorymethod(int type){
		if(type==1){
			return new PlaneToBeijin();
		}else if(type==2){
			return new TrainToBeijin();
		}else{
			return null;
		}
	}
}

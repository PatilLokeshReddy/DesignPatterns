package com.FactoryCalss;

import com.FactoryClsInf.Android;
import com.FactoryClsInf.IOS;
import com.FactoryClsInf.OS;

public class FactoryClass {
	public static void main(String[] args) {
		FactoryOperation fo=new FactoryOperation();
		OS obj=fo.getInstance("Android");
		obj.operatingSystem();
	}
}

package com.FactoryCalss;

import com.FactoryClsInf.Android;
import com.FactoryClsInf.IOS;
import com.FactoryClsInf.OS;
import com.FactoryClsInf.Windows;

public class FactoryOperation {

	public OS getInstance(String str)
	{
		if(str.equals("Iphone"))
		{
			return new IOS();
		}
		else if(str.equals("Android"))
		{
			return new Android();
		}
		else if(str.equals("Windows"))
		{
			return new Windows();
		}
		return null;
	}
}

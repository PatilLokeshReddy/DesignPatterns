package com.adop;

import com.FromTony.PilotPen;

public class AdopterPen implements Pen {
	PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);
	}

}

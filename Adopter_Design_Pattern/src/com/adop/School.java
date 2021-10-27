package com.adop;

public class School {

	public static void main(String[] args) {
		AdopterPen p=new AdopterPen();
		AssignmentWrite aw=new AssignmentWrite();
		aw.setP(p);
		aw.writeAssignment("i'm not intrested to write Assignment");
	}
}

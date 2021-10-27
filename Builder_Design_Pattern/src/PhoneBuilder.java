
public class PhoneBuilder {
	private String os;
	private String Processer;
	private int Battery ;
	private int Ram;
	private int Screensize;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;

	}
	public PhoneBuilder setProcesser(String processer) {
		this.Processer = processer;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.Battery = battery;
		return this;

	}
	public PhoneBuilder setRam(int ram) {
		this.Ram = ram;
		return this;

	}
	public PhoneBuilder setScreensize(int screensize) {
		this.Screensize = screensize;
		return this;

	}
	public Phone getPhone()
	{
		Phone p=new Phone(os, Processer, Battery, Ram, Screensize);
		return p;
	}

}

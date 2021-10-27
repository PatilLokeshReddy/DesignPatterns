
public class Phone {
	private String os;
	private String Processer;
	private int Battery ;
	private int Ram;
	private int Screensize;
	public Phone(String os, String processer, int battery, int ram, int screensize) {
		super();
		this.os = os;
		Processer = processer;
		Battery = battery;
		Ram = ram;
		Screensize = screensize;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", Processer=" + Processer + ", Battery=" + Battery + ", Ram=" + Ram
				+ ", Screensize=" + Screensize + "]";
	}

}

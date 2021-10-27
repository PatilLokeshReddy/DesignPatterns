
public class Shop {
	public static void main(String[] args) {
		Phone pb=new PhoneBuilder().setOs("IOS").setRam(4).setProcesser("M1").getPhone();
		System.out.println(pb);
	}
}

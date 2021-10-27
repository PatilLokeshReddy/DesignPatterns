
public class CompositeTest {

	public static void main(String[] args) {

		Component ram=new Leaf(2000, "Ram");
		Component hd=new Leaf(5000, "HDD");
		Component cpu=new Leaf(9000, "CPU");
		Component moniter=new Leaf(12000, "moniter");
		Component mouse=new Leaf(500, "mouse");


		Composite ph=new Composite("Peri");
		Composite mb=new Composite("Mother Boad");
		Composite cabinate=new Composite("Cabinate");
		Composite computer=new Composite("Computer");
		
		ph.addComponent(mouse);
		ph.addComponent(moniter);
		
		mb.addComponent(hd);
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		cabinate.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(mb);
		computer.addComponent(cabinate);
		ram.showPrice();
	}

}

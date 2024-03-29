import framework.Manager;
import framework.Product;
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		manager.register("strong", upen);
		manager.register("warning", mbox);

		Product p1 = manager.create("strong");
		p1.use("unti");
		Product p2 = manager.create("warning");
		p2.use("unti");
	}

}

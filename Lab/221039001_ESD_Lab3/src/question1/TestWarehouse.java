package question1;

public class TestWarehouse {
	
	public static void main(String[] args) {
		
		ProductWarehouse pw = new ProductWarehouse("Pepsi", 20000);
	
		assert(pw.getCapacity() == 20000);
		assert(pw.takeFromWarehouse(1000) == 19000);
	}
}
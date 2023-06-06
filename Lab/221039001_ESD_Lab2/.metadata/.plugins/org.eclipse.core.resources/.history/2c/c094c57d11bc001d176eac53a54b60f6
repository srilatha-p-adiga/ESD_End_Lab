package question2;
import java.util.Scanner;
public class testDrug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d_id,qty;
		
		String name;
		
		Drug d = new Drug(101,"B-complex",10,"xyz",50);
		
		System.out.println("Enter the Drug_ID and Name:");
		
		d_id = sc.nextInt();
		
		name = sc.next();
		
		if(d.getDrug(d_id,name) == 0){
		
			System.out.println(d.drug_name+" is out of stock..");
		
		}else{
			
			System.out.println("*****Drug Details*****");
			
			 System.out.println("Drug_ID: "+d.drug_id+"\n"+"Drug_Name: "+d.drug_name+"\n"
					 +"Price: "+d.price+"\n"+"Manufacturer: "+d.manufacturer+"\n"+"Available: "+d.stock_position+"\n");
			
			 System.out.println("*****End*****");
			 
			 System.out.print("Enter the quantity: ");
			 
			 qty = sc.nextInt();
			 
			 if(qty>d.stock_position) {
			
				 System.out.print("...Required quantity is not in stock...");
			 
			 }else {
				 
				 System.out.print("Cost of Required quantity is : "+d.getBill(qty));
			 
			 }
		
		}
		
	}

}

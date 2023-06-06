package question2;

public class Drug{
	//instance variables
	 int drug_id;
	 String drug_name;
	 int price;
	 String manufacturer;
	 int stock_position;
	 Drug(int drug_id, String drug_name, int price, String manufacturer, int stock_position)
	 {
		this.drug_id = drug_id;
		this.drug_name = drug_name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.stock_position = stock_position;
	 }
	 
	 int getDrug(int drug_id,String drug_name)
	 {
		 if(this.drug_id != drug_id)
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }		 
	 }
	 int getBill(int required) 
	 {
		 return required*price;
	 }
	 
	 void updatePriceAndStock(int price,int stock) {
		 this.price = price;
		 this.stock_position = stock;
	 }
}

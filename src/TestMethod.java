
public class TestMethod {

	public static void main(String[] args) {
		// TODO Set and calculate numeric values
double subtotal = 100; 		//set subtotal to 100
double discountPercent = .2;//set discountPercent to 20%
double discountAmount = subtotal * discountPercent;
double invoiceTotal = subtotal - discountAmount;

//print the data to the console
System.out.println("Welcome ot he Invoice Total Calculator");
System.out.println();
System.out.println("Subtotal:)			" + subtotal);
System.out.println("Discount percent: " + discountPercent);
System.out.println("Discount amount: "   + discountAmount);
System.out.println("Total:  " + invoiceTotal);	
System.out.println();	
	}

}

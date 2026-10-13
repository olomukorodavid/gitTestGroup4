package _11_good_code_etiquette;
import java.util.*;
public class TheSpaghettiService {
	private static final int LEAST_STOCK_LEVEL=0;
	private static final double LEAST_PRICE_LEVEL=0.0;
	private static final double ELIGIBLE_DISCOUNT_PRICE_THRESHOLD=100.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processDiscount("IdilOrder", 30, 200.0);
	}
	
	public static void processDiscount(String name, int stock, double price) {
	    //return Optional.ofNullable(name).orElse("Product name not available");
		String finalMessage="";
	    if (name == null || name.isEmpty()) {
	    	System.out.println("Product name not available") ;
	    }
		if (inStock(stock) && validPrice(price)) {
			System.out.println("Processing " + name);
			//discount(price);
			System.out.println("Discount: "+ discount(price));
//			double discount = 0.0;
//			if (price > ELIGIBLE_DISCOUNT_PRICE_THRESHOLD) {
//				discount = price * 0.1;
//				finalMessage="Discount: " + discount;
//				System.out.println(finalMessage);
//			}	
		}
	}
	
	public static boolean inStock (int stockRequired) {
		return  (stockRequired>LEAST_STOCK_LEVEL)? true : false;
		
	}
	public static boolean validPrice (double price) {
		return (price>LEAST_PRICE_LEVEL)? true : false;
	}
	public static double discount (double price) {
		double discountRate = price*0.1;
		return (price>ELIGIBLE_DISCOUNT_PRICE_THRESHOLD)? discountRate : 0;
	}

}

 // The class name is in lowercase and does not describe anything

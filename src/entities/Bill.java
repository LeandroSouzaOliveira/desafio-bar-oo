package entities;

public class Bill {
	
	public static final double BEER_PRICE = 5.00;
	public static final double SOFT_DRINK_PRICE = 3.00;
	public static final double BARBECUE_PRICE = 7.00;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return this.beer * BEER_PRICE + this.softDrink * SOFT_DRINK_PRICE + this.barbecue * BARBECUE_PRICE;
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double ticket() {
		if (this.gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
}

package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public static final double PRICEMEN = 10.0;
	public static final double PRICEWOMAN = 8.0;
	public static final double PRICEBEER = 5.0;
	public static final double PRICESOFTDRINK = 3.0;
	public static final double PRICEBARBECUE = 7.0;	
	public static final double COUVERARTITISCO = 4.0;
	
	public  double cover() {
		double cover = 0.0;
		if(feeding() >= 30.0) {
			cover = 0.0;
		}
		else {
			cover += COUVERARTITISCO;
		}
		return cover;
	}
	
	public double feeding() {
		return (beer * PRICEBEER) + (barbecue * PRICEBARBECUE) + (softDrink * PRICESOFTDRINK);
	}
	
	public double ticket() {
		double priceTicket = 0.0;
		if (gender == 'F') {
			priceTicket += PRICEWOMAN;
		}
		else {
			priceTicket += PRICEMEN;
		}
		return priceTicket;
	}
	
	public double total() {
		return  feeding() + ticket() + cover();
	}
}

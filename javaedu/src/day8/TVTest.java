package day8;

public class TVTest {
	public static void main(String[] args) {
		SaleTV sTV = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rTV = new RentalTV(100000, "RENTALTV-10 ", 42, 1);
		
		sTV.channelUp();
		sTV.channelUp();
		
		rTV.channelDown();
		rTV.channelDown();
		rTV.channelDown();
		
		printAllTV(sTV);
		printAllTV(rTV);
		printRentalTV(rTV);
	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		tv.play();
		
		if (tv instanceof SaleTV) {
            ((SaleTV) tv).sale();
        }
	}
	static void printRentalTV(Rentable tv) {
        tv.rent();
    }
}

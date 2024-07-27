
class BookMyShow{
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("running bookMovieTicket in BookMyShow");
		System.out.println("Movie Name:"+name);
		System.out.println("Theater Name:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("Ticket Price:"+price);
		
		if(quantity>0 && quantity<=10)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>100 && price<=250)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
	}
	
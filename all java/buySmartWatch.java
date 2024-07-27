
	public static void buySmartWatch(String brand,double price,String color,char type,int mode)
	{
		System.out.println("running buySmartWatch in BookMyShow");
		System.out.println("brand Name:"+brand);
		System.out.println("watch price:"+price);
		System.out.println("watch color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		
		
		if(mode>0 && mode<=5)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>100.0 && price<=10000.0)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
}
}

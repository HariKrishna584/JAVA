class  DeliveryGuy
{
	public static void deliver1(String item)
	{
		System.out.println("running deliver in DeliveryGuy");
		DeliveryVehicle.deliver(item,"fixed");
	}
}

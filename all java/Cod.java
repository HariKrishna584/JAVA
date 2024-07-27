class Cod{
	public static String country(int code)
	{
		System.out.println("Running country in Intern");
		if(code==91)
		{
		System.out.println("its code of india");
		return "India";
		}
        else
		{
		System.out.println("not the code of india");
		return "wrong code";	
		}
       		
	}

	public static double medicine(String medicineName)
	{
		System.out.println("Running medicine in Trainee");
		
		if(medicineName=="DOLO 650")
		{
		System.out.println("Tablet name is DOLO 650");
		return 30;
		}
		
		System.out.println("no tablets matched ");
		return 0;	
	}
	

	public static void puc()
	{
		System.out.println("running puc in College");
		return ;
	}
}
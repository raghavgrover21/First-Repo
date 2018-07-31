class code{
	public static void main(String[] args)
	{
		int num = 13;
		int i = 2;
		
		for( i = 2; i < num; i++)
		{
			if(num % i == 0)
				break;
		}

		if(i == num) 
			System.out.println("Number is prime");
		else 
			System.out.println("Number is not prime.");
	
	}	
}
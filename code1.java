class code{
	public static void main(String[] args)
	{
		int num = 13;
		int i = 2;

	
	int count = 0;

	for(i = 1; i*i <= num; i++){
		if(num%i == 0) count++;		
	}

	if(count == 1) System.out.println("Number is Prime");
	else System.out.println("Number is not prime.");
	}	
}
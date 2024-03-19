class CoPrimeNumber
{//Co-prime numbers are pairs of numbers that do not have any common factor other than 1. 
	public static void main(String [] cpn)
	{
		int num1=8;
		int num2=15;
		int count=0;
		
		for(int i=1; i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				count++;
				if(count>1)
				{
					break;
				}
			}
		}
		if(count==1)
		{
			System.out.println("Numbers are Co-Prime");
		}
		else
		{
			System.out.println("Numbers are not Co-Prime");
		}
	}
}


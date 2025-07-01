class Prime
{
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		System.out.println(Prime.isPrime(n));
	}
}
public class prime_vowel
{
	void vowel (String x)
	{
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' )
		{
            System.out.println(x + " is vowel");
		}
        else
		{
            System.out.println(x + " is consonant");
		}

	}
	void prime (String x)
	{
		if (x%2==0)
		{
			System.out.println(x + " prime number ");
		}
		else
		{
			System.out.println(x + " not prime number ");
		}
	}
}

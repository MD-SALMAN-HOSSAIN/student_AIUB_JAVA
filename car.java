public class car
{
	public String name;
    public String brand;
    private int howMany;
	
	public car()//defult constractor
	{
		System.out.println("name: ");
	}
	public car(String name,String brand,int howMany)
	{
		this.name = name;
		this.brand = brand;
		this.howMany=howMany;
	}
	public void sethowMany(int howMany)
	{
		this.howMany = howMany ;
	}
		
	public float gethowMany()
	{
		return this.howMany	;
	}
		
		public void showInformation()
	{
		System.out.println("name: "+name);
		System.out.println("brand: "+brand);
		System.out.println("howMany: "+howMany);
	}
}
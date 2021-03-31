class Person
{
	public String name ;
	protected int age ;
	public Address address ;
	
	public Person()
	{
		
	}
	public Person( String name , int age , Address address )
	{
		
		this.name = name ;
		this.age = age ;
		this.address = address ;
		
	}
	public void canEat()
	{
		System.out.println("Can eat") ;
	}	
	public void show()
	{
		System.out.println("Name: " + name) ;
		System.out.println("Age: " + age) ;
		System.out.println("House Name: " + address.getHouseName() + ", House No: "+ address.getHouseNo() + ", Road no: "+ address.roadNO) ;
	}
		
}
****************************************************************************************************************************************************************************8

class Address 
{
	private String houseName ;
	private int houseNo ;
	public int roadNO ;
	
	public Address()
	{
		
	}
	public Address( String houseName , int houseNo , int roadNO)
	{
		this.houseName = houseName ;
		this.houseNo = houseNo ;
		this.roadNO = roadNO ;
	}
	public void setHouseName( String houseName)
	{
		this.houseName = houseName ;
	}
	public void setHouseNo( int houseNo)
	{
		this.houseNo = houseNo ;
	}
	public String getHouseName()
	{
		return this.houseName ;
	}
	public int getHouseNo()
	{
		return this.houseNo ;
	}
}
**************************************************************************************************************************
class Main
{
	public static void main(String arg[])
	{
		
		Address address = new Address("test", 10 , 15) ;
		
		Person p1 = new Person("abc" , 40 , address) ;
		
		p1.show() ;
		
	}
}
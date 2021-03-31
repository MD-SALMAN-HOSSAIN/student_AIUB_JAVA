public class Student
{
	public String name ; // instance variable 
	public String id ;
	private float cgpa ;
	
	public Student() // default constructor
	{
		
	}
	public Student(String name, String id, float cgpa) // parameterized constructor ("test", "1-1", 3.0f)
	{
		this.name = name ;
		this.id = id ;
		this.cgpa = cgpa;
	}
	public Student(float cgpa) // parameterized Constructor 
	{
		this.cgpa = cgpa ;
	}
	
	public void setCgpa(float cgpa) // instance method
	{
		this.cgpa = cgpa ;
	}
	public float getCgpa()
	{
		return this.cgpa ;
	}
	public void showInformation()
	{
		System.out.println("Name: "+name) ;
		System.out.println("ID: "+id) ;
		System.out.println("Cgpa: "+cgpa) ;
	}
	
	
}
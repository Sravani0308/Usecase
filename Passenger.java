package finalproject;

public class Passenger {

private	String Name;
	private int Age;
	private char gender;
	
	public  Passenger(String name, int age, char gender)
	{
		super();
		this.Name=Name;
		this.Age=Age;
		this.gender=gender;
	}

		public String getName()
	{
		return Name;
		
		}
	public void setName() {
		this.Name=Name;
		System.out.println("enter Name of passenger: "+Name);
	}
	public int getAge()
	{
		return Age;
		
		}
	
	public void setAge() {
		this.Age=Age;
		System.out.println("enter Age of passenger:  "+Age);
	}
	
	
	public char getGender() {
		return gender;
	}

	public void setGender() {
		this.gender = gender;
		System.out.println("enter gender "+gender);
	}

	@Override
	public String toString() {
		return "Passenger [getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + "]";
	}

	
	
	}
	


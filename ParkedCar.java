public class ParkedCar
{
	private String make;
	private String color;
	private String license;
	
	public ParkedCar( String m, String c, String l )
	{
		make = m;
		color = c;
		license = l;
	}

	public String getMake( )
	{
		return make;
	}
	
	public String getColor( )
	{
		return color;
	}
	
	public String getLicense( )
	{
		return license;
	}
	
	public String toString( )
	{
		String result;
		
		result = "Car: " + color + " " + make + " License: " + license;
		
		return result;
	}

}
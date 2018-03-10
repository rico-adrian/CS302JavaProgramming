public class ParkingTicket
{
	private String make;
	private String color;
	private String license;
	private int fine;
	
	public ParkingTicket( ParkedCar c )
	{
		make = c.getMake( );
		color = c.getColor( );
		license = c.getLicense( );
		fine = 0;
	}

	public ParkingTicket( ParkedCar c, int timeOver )
	{
		make = c.getMake( );
		color = c.getColor( );
		license = c.getLicense( );
		calculateFine( timeOver );
	}

	public void calculateFine( int t )
	{
		fine = 0;
		
		// only fines for overparking
		if ( t < 0 )
		{
			// set overparking to a positive
			t = -t;
			// determine complete hours
			int hours = t / 60;
			// determine if there is an additional part of an hour
			boolean part = ( t % 60 ) != 0 ;
			
			// $25 for first hour OR part of an hour
			if ( hours > 0 || part )
			{
				fine = 25;
				// decrement complete hours
				//   note: if only part of an hour then hours <- -1
				hours--;
			}
			
			// for any complete hours remaining charge $10
			while ( hours > 0 )
			{
				fine += 10;
				hours--;
			}
			
			// for any partial hours remaining charge $10
			//    note: nothing charged if hours are now < 0
			if (hours == 0 && part )
				fine += 10;
		}
		
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

	public int getFine( )
	{
		return fine;
	}
	
	public String toString( )
	{
		String result;
		
		result = "Car: " + color + " " + make + " License: " + license
		         + "\nFine: " + fine;
		
		return result;
	}

}
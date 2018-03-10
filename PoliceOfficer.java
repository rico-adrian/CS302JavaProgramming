import java.util.Random;

public class PoliceOfficer
{
	private String name;
	private int badgeNumber;
	private Random timeToCheckGenerator;
	private int timeToNextCheck;
	
	public PoliceOfficer( String n, int badge )
	{
		name = n;
		badgeNumber = badge;
		timeToCheckGenerator = new Random( );
		setNextCheck( );
	}
	
	public void setNextCheck( )
	{
		timeToNextCheck = 10 + timeToCheckGenerator.nextInt( 120 );
	}
	
	public boolean checkMeterForOverPark( ParkingMeter p )
	{
		return ( p.getTimeReading( ) < 0 );
	}
	
	public ParkingTicket issueTicket( ParkedCar c , ParkingMeter p )
	{
		ParkingTicket t = new ParkingTicket( c, p.getTimeReading( ) );
		
		return t;
	}
	
	public void tick( )
	{
		timeToNextCheck--;
	}
	
	public int getTimeToNextCheck( )
	{
		return timeToNextCheck;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public int getBadgeNumber( )
	{
		return badgeNumber;
	}

	public String toString( )
	{
		String result;
		
		result = "Officer " + name + " Badge #" + badgeNumber;
		
		return result;
	}
}
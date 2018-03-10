   public class ParkingMeter
   {
      private int minutesPurchased;
   
       public ParkingMeter( )
      {
         minutesPurchased = 0;
      }
   
       public ParkingMeter( int min )
      {
         minutesPurchased = min;
      }
   
       public void setMinutesPurchased( int min )
      {
         minutesPurchased = ( min < 0 )? 0 : min;
      }
   
       public int getTimeReading( )
      {
         return minutesPurchased;
      }
   
       public void tick( )
      {
         minutesPurchased--;
      }
   }
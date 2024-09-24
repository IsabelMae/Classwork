
public class Clock {
	// Instance Variables - Private can only be used in this code. 
		private int hr;
		private int min;
		private int sec;
		
	// Constructor Method (Overloaded) - Builds the clock.
		public Clock()
		{
			hr = 0;
			min = 0;
			sec = 0;
		}
		
		public Clock(int hours, int minutes, int seconds)
		{
			hr = hours;
			min = minutes;
			sec = seconds;
		}

}

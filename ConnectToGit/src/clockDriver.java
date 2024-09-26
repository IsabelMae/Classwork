
public class clockDriver {

	public static void main(String[] args) {
		
		Clock myClock = new Clock();
		Clock yourClock = new Clock(12, 59, 59);
		myClock.setTime(1, 2, 3);
		myClock.setHour(33);
		System.out.println(yourClock.getHour());
		System.out.println(myClock);
		myClock.incrementHours();
		System.out.println(yourClock);
		yourClock.incrementMinutes();
		System.out.println(yourClock);
		yourClock.printTime();
	}

}

package exercicio3;

public class Time {
	int hour;
	int minute;
	
	Time(){};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		TimeCapsule tc = new TimeCapsule();
		tc.setHour(4);
		tc.setMinute(55);
		t.hour = 3;
		t.minute = 25;
		System.out.println("The time now is " + t.hour + ":" + t.minute);
		System.out.println("And now is " + tc.getHour() + ":" + tc.getMinute());
	}
}
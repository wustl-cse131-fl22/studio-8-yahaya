package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean is24hour;

	public Time(int hour, int minute, boolean is24hour) {
		this.hour = hour;
		this.minute = minute;
		this.is24hour = true;
	}

	@Override
	public String toString() {
		return "Time: " + hour + ":" + minute;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time t1 = new Time(12, 12, true);
		Time t2 = new Time(1,1,true);
		Time t3 = new Time(1,1,false);
		Time t4 = new Time(5,3,false);

		System.out.println(t2.equals(t4));
	}

}
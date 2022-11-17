package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment: " + date + " " + time;
	}

	public static void main(String[] args) {
		Date d1 = new Date(25, 12, 2012, true);
		Date d2 = new Date(24, 12, 2012, true);
		Date d3 = new Date(1, 1, 2013, true);
		Date d4 = new Date(4, 7, 2013, true);
		Date d5 = new Date(2, 1, 2013, false);
		Time t1 = new Time(12, 12, true);
		Time t2 = new Time(1, 10, true);
		Time t3 = new Time(1, 10, false);
		Time t4 = new Time(5, 30, false);

		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t2);
		Appointment a3 = new Appointment(d3, t3);
		Appointment a4 = new Appointment(d4, t4);
		LinkedList<Appointment> Calendar = new LinkedList<Appointment>();
		Calendar.add(a1);
		Calendar.add(a2);
		Calendar.add(a3);
		Calendar.add(a4);
		System.out.println(Calendar);
	}

}

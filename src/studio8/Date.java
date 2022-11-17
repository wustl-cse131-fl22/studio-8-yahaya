package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int day;
	private int month;
	private int year;
	private boolean isHoliday;

	public Date(int day, int month, int year, boolean isHoliday) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	@Override
	public String toString() {
		return "Date: " + day + "/" + month + "/" + year + " " + isHoliday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(25, 12, 2012, true);
		Date d2 = new Date(24, 12, 2012, true);
		Date d3 = new Date(1, 1, 2013, true);
		Date d4 = new Date(4, 7, 2013, true);
		Date d5 = new Date(2, 1, 2013, false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d3);
		list.add(d1);
		list.add(d2);
		list.add(d1);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d3);
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set);
	}

}

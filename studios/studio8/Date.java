package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private final int month;
	private final int day;
	private final int year;
	private final boolean holiday;

	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public boolean isEarlier(Date newDate) {
		if (year < newDate.getYear())
			return true;
		else if (year == newDate.getYear() && month < newDate.getMonth())
			return true;
		else if (year == newDate.getYear() && month == newDate.getMonth() && day < newDate.getDay())
			return true;
		else
			return false;
	}

	public boolean amWorking() {
		if (day == 1 || day == 3 || day == 5 || day == 7 || day == 9 || day == 11 || day == 13 || day == 15 || day == 17
				|| day == 19 || day == 21 || day == 23 || day == 25 || day == 27 || day == 29)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		if (holiday == true)
			return "Date: " + month + "-" + day + "-" + year + ", and is a Holiday";
		else
			return "Date: " + month + "-" + day + "-" + year + ", and is not a holiday";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
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
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public static void main(String[] args) {

		LinkedList<Date> dateList = new LinkedList<Date>();
		HashSet<Date> dateHash = new HashSet<Date>();

		Date a = new Date(1, 30, 2018, true);
		Date b = new Date(2, 29, 2015, false);
		Date c = new Date(3, 29, 2012, true);
		Date d = new Date(4, 27, 2009, false);
		Date e = new Date(5, 26, 2006, true);
		Date f = new Date(6, 25, 2003, false);

		dateList.add(a);
		dateList.add(b);
		dateList.add(c);
		dateList.add(d);
		dateList.add(e);
		dateList.add(f);

		dateHash.add(a);
		dateHash.add(b);
		dateHash.add(c);
		dateHash.add(d);
		dateHash.add(e);
		dateHash.add(f);

		System.out.println(dateList);
		System.out.println(dateHash);

	}

}

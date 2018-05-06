package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Time {

	private final int hour;
	private final int min;
	private final boolean military;

	public Time(int hour, int min, boolean military) {
		this.hour = hour;
		this.min = min;
		this.military = military;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public boolean isEarlier(Time newTime) {
		if (hour < newTime.getHour())
			return true;
		else if (hour == newTime.getHour() && min < newTime.getMin())
			return true;
		else
			return false;
	}

	public boolean amWorking() {
		if (hour < 16 && hour > 8)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		if (military == false && hour > 12)
			return "Time: " + (hour - 12) + ":" + min + " PM";
		if (military == false && hour < 12)
			return "Time: " + (hour) + ":" + min + " AM ";
		if (this.military == true && this.hour == 12)
			return "Time: " + (hour) + ":" + min + " PM";
		else
			return "Time: " + hour + ":" + min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	public static void main(String[] args) {

		LinkedList<Time> timeList = new LinkedList<Time>();
		HashSet<Time> timeHash = new HashSet<Time>();

		Time a = new Time(1, 55, true);
		Time b = new Time(5, 44, false);
		Time c = new Time(9, 33, false);
		Time d = new Time(13, 22, false);
		Time e = new Time(17, 11, false);
		Time f = new Time(21, 1, false);
		Time g = new Time(24, 27, false);
		
		timeList.add(a);
		timeList.add(b);
		timeList.add(c);
		timeList.add(d);
		timeList.add(e);
		timeList.add(f);
		timeList.add(g);

		timeHash.add(a);
		timeHash.add(b);
		timeHash.add(c);
		timeHash.add(d);
		timeHash.add(e);
		timeHash.add(f);
		timeHash.add(g);

		System.out.println(timeList);
		System.out.println(timeHash);
		
	}

}

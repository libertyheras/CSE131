package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Calendar {
	private Appointment appointment;

	public Calendar(Appointment appointment) {
		this.appointment = appointment;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Calendar [appointment=" + appointment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
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
		Calendar other = (Calendar) obj;
		if (appointment == null) {
			if (other.appointment != null)
				return false;
		} else if (!appointment.equals(other.appointment))
			return false;
		return true;
	}

	public static void main(String[] args) {
		List<Calendar> calender = new LinkedList<Calendar>();
		Date date = new Date(20, 3, 2008, true);
		Time time = new Time(17, 43, true);
		Appointment newAppointment = new Appointment(date, time);
		Calendar newCalendar = new Calendar(newAppointment);
		calender.add(newCalendar);

		System.out.println(calender);

	}

}

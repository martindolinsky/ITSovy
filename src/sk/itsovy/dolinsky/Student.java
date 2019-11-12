package sk.itsovy.dolinsky;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Martin Dolinsky
 */
public class Student {
	private String firstName;
	private String lastName;
	private Date birthDate;

	public Student(String name, String lastName, Date bDay) {
		this.firstName = name;
		this.lastName = lastName;
		this.birthDate = bDay;
	}

	public String getName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public int getBirthMonth() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		return month;
	}

	public int getBirthYear() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		return year;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}

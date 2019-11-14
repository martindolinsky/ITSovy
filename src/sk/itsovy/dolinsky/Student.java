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

	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private String[] subjects;
	private int size;
	private int capacity = 10;

	public Student(String name, String lastName, Date bDay) {
		this.firstName = name;
		this.lastName = lastName;
		this.birthDate = bDay;
	}

	public Student(String firstName, String lastName, int yearOfBirth, int monthOfBirth,  int dayOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.size = 0;
		this.subjects = new String[capacity];

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {

		return birthDate;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public String[] getSubjects() {
		return subjects;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName ;
	}

	public int getAge() {
		Calendar cal = Calendar.getInstance();
		int currYear = cal.get(Calendar.YEAR);
		int currMonth = cal.get(Calendar.MONTH);
		int currDay = cal.get(Calendar.DAY_OF_YEAR);
		int age = 0;

		if (currYear > this.getYearOfBirth()) {
			if (currMonth > this.getMonthOfBirth()) {
				if (currDay > this.getDayOfBirth()) {
					age = currYear - this.getYearOfBirth();
					return age;
				}
				else {
					age = currYear - this.getDayOfBirth() - 1;
					return age;
				}

			}
			else  {
				age = currYear - this.getDayOfBirth() - 1;
				return age;
			}
		}
		else {
			return 0;
		}
	}

	public String getZodiacSign() {
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_BLUE = "\u001B[34m";
		String text = "";
		text += "|---------------------------------------|" + "\n";
		switch (getMonthOfBirth()) {
			case 1:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 20) {
					text += "| " + ANSI_CYAN +"Capricorn" + ANSI_RESET +" | The Goat-fish hybrid      |"; break;
				}
				else if (getDayOfBirth() >= 21 && getDayOfBirth() <= 31) {
					text += "| " + ANSI_CYAN +"Aquarius" + ANSI_RESET +" | Water-bearer               |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"; break;
				}

			case 2:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 19) {
					text += "| " + ANSI_CYAN +"Aquarius" + ANSI_RESET +" | Water-bearer               |"; break;
				}
				else if (getDayOfBirth() >= 20 && getDayOfBirth() <= 29) {
					text += "| " + ANSI_CYAN +"Pisces" + ANSI_RESET +" | The Fishes                   |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 30!" + ANSI_RESET + "           |"; break;
				}

			case 3:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 20) {
					text += "| " + ANSI_CYAN +"Pisces" + ANSI_RESET +" | The Fishes                   |"; break;
				}
				else if (getDayOfBirth() >= 21 && getDayOfBirth() <= 31) {
					text += "| " + ANSI_CYAN +"Aries" + ANSI_RESET +" | The Ram                       |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"; break;
				}

			case 4:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 20) {
					text += "| " + ANSI_CYAN +"Aries" + ANSI_RESET +" | The Ram                       |"; break;
				}
				else if (getDayOfBirth() >= 21 && getDayOfBirth() <= 30) {
					text += "| " + ANSI_CYAN +"Taurus" + ANSI_RESET +" | The Bull                     |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 30!" + ANSI_RESET + "           |"; break;
				}

			case 5:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 21) {
					text += "| " + ANSI_CYAN +"Taurus" + ANSI_RESET +" | The Bull                     |"; break;
				}
				else if (getDayOfBirth() >= 22 && getDayOfBirth() <= 31) {
					text += "| " + ANSI_CYAN +"Gemini" + ANSI_RESET +" | The Twins                    |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"; break;
				}

			case 6:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 21) {
					text += "| " + ANSI_CYAN +"Gemini" + ANSI_RESET +" | The Twins                    |"; break;
				}
				else if (getDayOfBirth() >= 22 && getDayOfBirth() <= 30) {
					text += "| " + ANSI_CYAN +"Cancer" + ANSI_RESET +" | The Crab                     |"; break;
				}
				else {
					text += "| " + ANSI_RED + "Day should be from 1 to 30!" + ANSI_RESET + "           |"; break;
				}

			case 7:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 22) {
					text += "| " + ANSI_CYAN +"Cancer" + ANSI_RESET +" | The Crab                     |"; break;
				}
				else if (getDayOfBirth() >= 23 && getDayOfBirth() <= 31) {
					text += "| " + ANSI_CYAN +"Leo" + ANSI_RESET +" | The Lion                        |"; break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"); break;
				}

			case 8:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 23) {
					text += ("| " + ANSI_CYAN +"Leo" + ANSI_RESET +" | The Lion                        |"); break;
				}
				else if (getDayOfBirth() >= 24 && getDayOfBirth() <= 31) {
					text += ("| " + ANSI_CYAN +"Virgo" + ANSI_RESET +" | The Maiden                    |"); break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"); break;
				}

			case 9:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 23) {
					text += ("| " + ANSI_CYAN +"Virgo" + ANSI_RESET +" | The Maiden                    |"); break;
				}
				else if (getDayOfBirth() >= 24 && getDayOfBirth() <= 30) {
					text += ("| " + ANSI_CYAN +"Libra" + ANSI_RESET +" | The Scales                    |"); break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 30!" + ANSI_RESET + "           |"); break;
				}

			case 10:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 23) {
					text += ("| " + ANSI_CYAN +"Libra" + ANSI_RESET +" | The Scales                    |"); break;
				}
				else if (getDayOfBirth() >= 24 && getDayOfBirth() <= 31) {
					text += ("| " + ANSI_CYAN +"Scorpio" + ANSI_RESET +" | The Scorpion                |"); break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"); break;
				}

			case 11:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 22) {
					text += ("| " + ANSI_CYAN +"Scorpio" + ANSI_RESET +" | The Scorpion                |"); break;
				}
				else if (getDayOfBirth() >= 23 && getDayOfBirth() <= 30) {
					text += ("| " + ANSI_CYAN +"Sagittarius" + ANSI_RESET +" | The Archer              |"); break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 30!" + ANSI_RESET + "           |"); break;
				}

			case 12:
				if (getDayOfBirth() >= 1 && getDayOfBirth() <= 21) {
					text += ("| " + ANSI_CYAN +"Sagittarius" + ANSI_RESET +" | The Archer              |"); break;
				}
				else if (getDayOfBirth() >= 22 && getDayOfBirth() <= 31) {
					text += ("| " + ANSI_CYAN +"Capricorn" + ANSI_RESET +" | The Goat-fish hybrid       |"); break;
				}
				else {
					text += ("| " + ANSI_RED + "Day should be from 1 to 31!" + ANSI_RESET + "           |"); break;
				}

			default:
				text += ("| " + ANSI_RED + "Invalid month input!" + ANSI_RESET + "                  |");
		}


		text += "\n";
		if (this.getYearOfBirth() >= 1924 && this.getYearOfBirth() <= 2019) {

			switch (this.getYearOfBirth() % 12) {
				case 0:
					text += ("| You were born in the year of: " + ANSI_BLUE + "Monkey" + ANSI_RESET + "  |");
					// System.out.println();
					break;
				case 1:
					text += ("| You were born in the year of: " + ANSI_BLUE + "Rooster" + ANSI_RESET + " |");
					//System.out.println();
					break;
				case 2:
					text += ("| You were born in the year of: " + ANSI_BLUE + "Dog" + ANSI_RESET + "     |");
					//System.out.println();
					break;
				case 3:
					text += ("| You were born in the year of: " + ANSI_BLUE + "Pig" + ANSI_RESET + "     |");
					//System.out.println();
					break;
				case 4:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Rat" + ANSI_RESET + "    |");
					//System.out.println();
					break;
				case 5:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Ox" + ANSI_RESET + "    |");
					//System.out.println();
					break;
				case 6:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Tiger" + ANSI_RESET + "   |");
					//System.out.println();
					break;
				case 7:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Rabbit" + ANSI_RESET + "  |");
					//System.out.println();
					break;
				case 8:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Dragon" + ANSI_RESET + "    |");
					//System.out.println();
					break;
				case 9:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Snake" + ANSI_RESET + "    |");
					//System.out.println();
					break;
				case 10:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Horse" + ANSI_RESET + "    |");
					//System.out.println();
					break;
				case 11:
					text += ("| You were born in the year of: " + ANSI_BLUE +  "Sheep" + ANSI_RESET + "    |");
					//System.out.println();
					break;

				default:
					text += (ANSI_RED + "Wrong year input!" + ANSI_RESET);
					//System.out.println();
			}
		}
		else {
			text += ("| "+ ANSI_RED + "Year has to be from 1924 to 2019!" + ANSI_RESET + "     |");
		}

		text += ("\n" + "|---------------------------------------|");

		return text;
	}

	public boolean addSubject(String subject) {
		if (subject == null || size == capacity)
			return false;
		subjects[size] = subject;
		size++;
		return true;
	}

}

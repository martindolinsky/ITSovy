package sk.itsovy.dolinsky;

import java.util.Random;

/**
 * @author Martin Dolinsky
 */
public class Group {
	private String name;
	private int size;
	private int capacity;
	private Student[] arr;

	public Group(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.size = 0;
		this.arr = new Student[capacity];
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public Student[] getArr() {
		return arr;
	}

	public boolean addStudent(Student student) {
		if (student == null || size == capacity)
			return false;
		arr[size] = student;
		size++;
		return true;
	}

	public Student getStudent(String firstName, String lastName) {
		//TODO getStudent
		return null;
	}

	public boolean deleteStudent(Student student) {
		if (student == null || size == 0)
			return false;

		for (int i = 0; i < size; i++) {
			if (arr[i] == student) {
				// TODO delete
			}
		}
		return true;
	}

	public void print() {
		System.out.println("List of students [" +name + "] : ");
		for (int i = 0; i < size; i++) {
			System.out.println("   " + arr[i].toString());
		}
	}

	public void sort() {
		int n = size;

		if (size > 0) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
						Student temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) == 0) {
						if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName()) > 0) {
							Student temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
	}

	public Student randomStudent() {
		int a = 0;
		if (size > 0) {
			Random rn = new Random();

			a = rn.nextInt(size);

		}
		return arr[a];
	}

	public Student[] getStudent(int month) {
		int sizearr = 0;
		for (int i = 0; i < this.size; i++) {
			if (this.arr[i] != null && this.arr[i].getMonthOfBirth() == month) {
				sizearr++;
			}
		}
		Student[] temparr = new Student[sizearr];

		for (int i = 0; i < sizearr; i++) {
			if (this.arr[i] != null && this.arr[i].getMonthOfBirth() == month) {
				temparr[i] = this.arr[i];
			}
		}
		return temparr;
	}

	// mehtod have not got access to subjects array
	public Student getStudentBySubject() {

		return null;
	}

}
